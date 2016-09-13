package section.thirteen

/**
 * Created by cravo on 13/09/2016.
 */


Date today = new Date();
Range twoWeeks = today - 7..today + 7;

Thread.sleep(1000);
Date yesterday = new Date() - 1;

assert twoWeeks.contains(today);
assert !twoWeeks.contains(yesterday);

