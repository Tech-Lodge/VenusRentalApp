package com.semicolon.africa.Go_Rent_App.validations;

import com.semicolon.africa.Go_Rent_App.dtos.request.CreateUserRequest;
import org.hibernate.annotations.processing.Pattern;

import java.util.regex.*;

public class validations {

    public static void validateUser(CreateUserRequest request){
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String phoneRegex = "^(\\+234|0)?(701|702|703|704|705|706|707|708|709|710|711|712|713|714|715|716|717|718|719|720|721|722|723|724|725|726|727|728|729|730|731|732|733|734|735|736|737|738|739|740|741|742|743|744|745|746|747|748|749|750|751|752|753|754|755|756|757|758|759|760|761|762|763|764|765|766|767|768|769|770|771|772|773|774|775|776|777|778|779|780|781|782|783|784|785|786|787|788|789|790|791|792|793|794|795|796|797|798|799|800|801|802|803|804|805|806|807|808|809|810|811|812|813|814|815|816|817|818|819|820|821|822|823|824|825|826|827|828|829|830|831|832|833|834|835|836|837|838|839|840|841|842|843|844|845|846|847|848|849|850|851|852|853|854|855|856|857|858|859|860|861|862|863|864|865|866|867|868|869|870|871|872|873|874|875|876|877|878|879|880|881|882|883|884|885|886|887|888|889|890|891|892|893|894|895|896|897|898|899|900|901|902|903|904|905|906|907|908|909|910|911|912|913|914|915|916|917|918|919|920|921|922|923|924|925|926|927|928|929|930|931|932|933|934|935|936|937|938|939|940|941|942|943|944|945|946|947|948|949|950|951|952|953|954|955|956|957|958|959|960|961|962|963|964|965|966|967|968|969|970|971|972|973|974|975|976|977|978|979|980|981|982|983|984|985|986|987|988|989|990|991|992|993|994|995|996|997|998|999)\\d{6}$";
        String email = "example@example.com";
        String phone = "+2347012345678";

//        // Validate email
//        Pattern emailPattern = new Pattern();
//        Matcher emailMatcher = emailPattern.matcher(email);
//        if (emailMatcher.matches()) {
//            System.out.println("Valid email");
//        } else {
//            System.out.println("Invalid email");
//        }
//
//        // Validate phone number
//        Pattern phonePattern = Pattern.compile(phoneRegex);
//        Matcher phoneMatcher = phonePattern.matcher(phone);
    }

}
