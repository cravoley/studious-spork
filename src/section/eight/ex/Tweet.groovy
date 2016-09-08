package section.eight.ex

import java.util.regex.Pattern

/**
 * Created by cravo on 08/09/2016.
 */
class Tweet {
    String text;
    List hashtags, mentions;

    Tweet(String text) {
        this.text = text;
        this.mentions = extractMentions(text);
        this.hashtags = extractHashtags(text);
    }

    List extractHashtags(String s) {
        return extractList(text, ~/(?mi)(#.+?)(\s)/);
    }

    List extractMentions(String text) {
        return extractList(text, ~/(?im)(@.+?)(\s)/);
    }


    private List extractList(String text, Pattern pattern) {
        return extractList(text, pattern, 1);
    }

    private List extractList(String text, Pattern pattern, int groupToGet) {
        List list = [];
        if (text) {
            def matcher = text =~ pattern;
            println matcher;
//            println text;
            while (matcher.find()) {
                list << matcher.group(groupToGet);
            }
        }
        return list;
    }
}
