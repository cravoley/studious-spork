package section.twelve.rest.ex

import groovyx.net.http.RESTClient

/**
 * Created by cravo on 13/09/2016.
 */
@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7.1')


def apiUrl = 'http://jsonplaceholder.typicode.com';
RESTClient client = new RESTClient(apiUrl);
client.get(path: '/posts') {
    response, json ->
        println response.status;
        json.each {
            item ->
                println "user ${item.userId}";
                println "id ${item.id}";
                println "title ${item.title}";
        }
}
