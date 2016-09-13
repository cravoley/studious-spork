package section.twelve.rest

import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient

/**
 * Created by cravo on 13/09/2016.
 */

@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')
String base = "http://api.icndb.com";

def client = new RESTClient(base);
client.contentType = ContentType.JSON;

client.get(path: '/jokes/random/3') { response, json ->
    println json.value[2].joke;
    println json.value.joke[2];
}




