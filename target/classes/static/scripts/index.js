var i = 12;
var cpt = 0;
var champ = [];

function transpose(name){
    if (cpt < 9 && !champ.includes(name)){
        i++;
        cpt++;
        champ[i]= name;
        document.getElementById("team-comp-container").innerHTML += " <img id='"+i+"' onclick='onDelete("+i+")' class='champ-logo' src=\"../images/Cartes champs/" + name + ".png\" height='95px' width='295px'/> ";
        $(".champ-logo").css("padding","8px 0 0 7px").css("width","33%");
        $("#"+ name).css("opacity", "0.4");
        $(".champ1").val('test');
    }else if(champ.includes(name)){
        onDelete(champ.indexOf(name));
    }
}

function onDelete(id){
    $("#"+id).remove();
    $("#"+ champ[id]).css("opacity", "1");
    champ[id] = null;
    $(".champ" + cpt).val('');
    cpt--;
}
