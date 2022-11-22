let courses={"soups":"soups","starters":"starters","currys":"currys","rotis naans":"rotis-naans","main course":"main-course","deserts":"deserts","beverages":"beverages"}



let food={"tomato soup soups":"tomato-soup","corn soup soups":"corn-soup","chicken soup soups":"chicken-soup","spring rolls starters":"spring-rolls",
            "manchuria starters":"manchuria","paneer tikka starters":"paneer-tikka","french fries starters":"french-fries","paneer butter masala currys":"paneer-butter-masala","aloo masala currys":"aloo-masala",
            "mixed vegetable currys":"mixed-vegetable","kadai paneer currys":"kadai-paneer","gobi masala currys":"gobi-masala","kaju paneer currys":"kaju-paneer","tandoori roti":"tandoori-roti",
            "butter roti":"butter-roti","naan":"naan","veg biryani main course":"veg-biryani","chicken biryani main course":"chicken-biryani","mutton biryani main course":"mutton-biryani",
            "veg fried rice main course":"veg-fried-rice","egg fried rice main course":"egg-fried-rice","chicken fried rice main course":"chicken-fried-rice","chocolate icecream deserts":"chocolate-icecream",
            "chocobar deserts":"chocobar","cheese cake deserts":"cheese-cake","pudding deserts":"pudding","choco lava cake deserts":"choco-lava-cake","water beverages":"water","cold water beverages":"cold-water",
            "cola beverages":"cola","mojito beverages":"mojito","sprite beverages":"sprite","coffee beverages":"coffee"}




let catg={"soups":["tomato-soup","corn-soup","chicken-soup"],"starters":["spring-rolls","manchuria","paneer-tikka","french-fries"],"currys":["paneer-butter-masala","aloo-masala","mixed-vegetable","kadai-paneer","gobi-masala","kaju-paneer"],
            "rotis-naans":["tandoori-roti","butter-roti","naan"],"main-course":["veg-biryani","chicken-biryani","mutton-biryani","egg-fried-rice","veg-fried-rice","chicken-fried-rice"],
            "deserts":["chocolate-icecream","chocobar","cheese-cake","pudding","choco-lava-cake"],"beverages":["water","cold-water","cola","mojito","sprite","coffee"]}



let prices={"tomato-soup":30,"corn-soup":30,"chicken-soup":50,"spring-rolls":40,"manchuria":80,"paneer-tikka":90,"french-fries":100,"paneer-butter-masala":180,"aloo-masala":160,"mixed-vegetable":150,"kadai-paneer":190,"gobi-masala":150,"kaju-paneer":210,
            "tandoori-roti":20,"butter-roti":25,"naan":20,"veg-biryani":230,"chicken-biryani":260,"mutton-biryani":290,"egg-fried-rice":200,"veg-fried-rice":180,"chicken-fried-rice":210,"chocolate-icecream":45,"chocobar":30,"cheese-cake":60,"pudding":65,"choco-lava-cake":80,
            "water":20,"cold-water":30,"cola":25,"mojito":40,"sprite":25,"coffee":30

}

let l=0

localStorage.clear();


let dropcont=null;
let dropcont1=null;




function searchItem()
{
    let val=document.querySelector("#menu-search").value.toLowerCase();
    let temp;
    let isearch=true;
    if("soups".indexOf(val)>=0||"starters".indexOf(val)>=0||"currys".indexOf(val)>=0||"rotis nanas".indexOf(val)>=0||"main course".indexOf(val)>=0||"deserts".indexOf(val)>=0||"beverages".indexOf(val)>=0)
    {
        for(let i in courses)
        {
            if(i.indexOf(val)<0)
            {
                temp=document.querySelector("#"+courses[i])
                temp.style.display="none";
            }
            else{
                if(i.indexOf(val)==0&&l<val.length)
                {
                    isearch=false;
                }
                temp=document.querySelector("#"+courses[i])
                temp.style.display="block";
            }
        }
    }
    if(isearch)
    {
        for(let i in food)
        {
            if(i.indexOf(val)<0)
            {
                temp=document.querySelector("#"+food[i])
                temp.style.display="none";
            }
            else{
                temp=document.querySelector("#"+food[i])
                temp.style.display="block";
                temp.parentElement.style.display="block";
            }
        }
    }
    for(let i in catg)
    {
        let t=0
        if(document.querySelector("#"+i).style.display!="none")
        {
            for(let j of catg[i])
            {
                if(document.querySelector("#"+j).style.display!="none")
                {
                    t++;
                }
            }
        }
        if(t==0)
        {
            document.querySelector("#"+i).style.display="none"
        }
    }
    l=val.length;
}





let tables=["table1","table2","table3"]

function searchTable()
{
    let tabs=document.querySelectorAll(".btables")
    let stable=document.querySelector("#table-search").value.toLowerCase()
    for(let i=0;i<tables.length;i++)
    {
        if(tables[i].indexOf(stable)<0)
        {
            tabs[i].style.display="none"
        }
        else{
            tabs[i].style.display="block"
        }
    }
}




function popup(sid)
{
    document.querySelector(sid).style.display="block"
}



function popclose(sid)
{
    document.querySelector(sid).style.display="none"
}




for(let i=0;i<3;i++)
{
    document.querySelector("#"+tables[i]).addEventListener("dragenter",()=>{entered(tables[i],"t"+(i+1)+"b1")})
    document.querySelector("#"+tables[i]).addEventListener("dragleave",escaped)

}



function entered(tabid,ptabid)
{
    console.log("entered")
    dropcont="#"+tabid
    dropcont1="#"+ptabid
}




function escaped()
{
    console.log("left")
}










for(let i in food)
{
    document.querySelector("#"+food[i]).setAttribute("draggable","true")
    document.querySelector("#"+food[i]).addEventListener("dragstart",()=> {dragstarted(food[i])})
    document.querySelector("#"+food[i]).addEventListener("dragend",()=>{dragended(food[i])})
}




function dragstarted(x)
{
    console.log(x)
}


function dragended(x)
{
    if(dropcont1!=null)
    {
   if(document.querySelector(dropcont1+x))
    {
        document.querySelector(dropcont1+x+" input").value=parseInt(document.querySelector(dropcont1+x+" input").value)+1;
        document.querySelector("div"+dropcont+" span").innerHTML=parseInt(document.querySelector("div"+dropcont+" span").innerHTML)+prices[x];
        document.querySelector(dropcont1+"s").innerHTML=document.querySelector("div"+dropcont+" span").innerHTML
        localStorage.setItem(dropcont1+x,parseInt(localStorage.getItem(dropcont1+x))+1)
    }
    else{
        let y=null
        if(dropcont1=="#t1b1")
        {
            y="t1b1";
        }
        else if(dropcont1=="#t2b1")
        {
            y="t2b1";
        }
        else{
            y="t3b1";
        }
        let z=y
        y=y+x;
        localStorage.setItem(dropcont1+x,1)
        document.querySelector(dropcont1+" div").innerHTML+=`<table id=${y}><tr><td>${x}</td> <td><input type='number' min='1' value=1 oninput='itemChange(${JSON.stringify(y)},${JSON.stringify(z)},${JSON.stringify(dropcont)},${JSON.stringify(x)})'</td><td> <a onclick='rem(${JSON.stringify(y)},${JSON.stringify(z)},${JSON.stringify(dropcont)},${JSON.stringify(x)})'><img src='del.jpg' width='14px' height='19px'/></a></td></tr></table>`;
        document.querySelector("div"+dropcont+" span").innerHTML=parseInt(document.querySelector("div"+dropcont+" span").innerHTML)+prices[x];
        document.querySelector(dropcont1+"s").innerHTML=document.querySelector("div"+dropcont+" span").innerHTML
    }
    }
    itemupdates()
}

function itemChange(itemChanged,cont,tab,forprice)
{
    if(parseInt(document.querySelector("#"+itemChanged+" input").value)<localStorage.getItem("#"+itemChanged))
    {
        document.querySelector(tab+" span").innerHTML=parseInt(document.querySelector(tab+" span").innerHTML)-prices[forprice];
        document.querySelector("#"+cont+"s").innerHTML=document.querySelector(tab+" span").innerHTML
        localStorage.setItem("#"+itemChanged,parseInt(localStorage.getItem("#"+itemChanged)-1))
    }
    else if(parseInt(document.querySelector("#"+itemChanged+" input").value)>localStorage.getItem("#"+itemChanged))
    {
        document.querySelector(tab+" span").innerHTML=parseInt(document.querySelector(tab+" span").innerHTML)+prices[forprice];
        document.querySelector("#"+cont+"s").innerHTML=document.querySelector(tab+" span").innerHTML
        localStorage.setItem("#"+itemChanged,parseInt(localStorage.getItem("#"+itemChanged))+1)
    }
}




function rem(valuetorem,cont,tab,forprice)
{
    document.querySelector(tab+" span").innerHTML=parseInt(document.querySelector(tab+" span").innerHTML)-parseInt(localStorage.getItem("#"+valuetorem))*prices[forprice];
    document.querySelector("#"+cont+"s").innerHTML=document.querySelector(tab+" span").innerHTML
    document.querySelector("#"+cont+" div").removeChild(document.querySelector("#"+valuetorem))
    localStorage.removeItem("#"+valuetorem)
}


function showbill(tabl)
{
    let bill=document.querySelector("div#"+tabl+" span").innerHTML;
    window.alert("The bill for "+tabl+" is Rs: "+bill);
}



function itemupdates()
{
    for(let i=0;i<localStorage.length;i++)
    {
        document.querySelector(localStorage.key(i)+" input").value=localStorage.getItem(localStorage.key(i));
    }
}