let ele=document.querySelector("#dnav")
ele.innerHTML=` <ul id="navigation">
<li><a href="home.html" target="_self" id="a1" onclick="change('a1')" onmouseover="over('a1')" onmouseout="out('a1')">Home</a></li>
<li><a href="info.html" target="_self" id="a2" onclick="change('a2')" onmouseover="over('a2')" onmouseout="out('a2')">About me</a></li>
<li><a href="contact.html" target="_self" id="a3" onclick="change('a3')" onmouseover="over('a3')" onmouseout="out('a3')">Contact me</a></li>
<li><a href="gallery.html" target="_self" id="a4" onclick="change('a4')" onmouseover="over('a4')" onmouseout="out('a4')">Gallery</a></li>
</ul>`
let rvisited='a1'
function change(navid)
{
    rvisited=navid;
    let ids=['a1','a2','a3','a4']
    for(let i of ids)
    {
        if(navid==i)
        {
            document.querySelector("li #"+i).style.backgroundColor="#0178a5";
            
        }
        else{
            document.querySelector("li #"+i).style.backgroundColor="#0148a5";
        }
    }
}
function over(navid)
{
    let ids=['a1','a2','a3','a4']
    for(let i of ids)
    {
        if(navid==i)
        {
            document.querySelector("li #"+i).style.backgroundColor="#117df9";
            
        }
    }
}
function out(navid)
{
    let ids=['a1','a2','a3','a4']
    for(let i of ids)
    {
        if(navid==i)
        {
            if(navid==rvisited)
            {
                document.querySelector("li #"+i).style.backgroundColor="#0178a5";
            }
            else{
                document.querySelector("li #"+i).style.backgroundColor="#0148a5";
            }
            
        }
    }
}
function popopen()
{
    document.querySelector("#intro-popup").style.display="block";
}


function send()
{
    alert("your intro is sent");
    popclose()
}


function popclose()
{
    document.querySelector("#intro-popup").style.display="none";
}
