package section.eight.ex


def tweetString = '''This is a tweet with mentions and #hashtags to test @ApacheGroovy. I was challenged by @therealdan to do this #dev #devlife ''';
def tweet = new Tweet(tweetString);

println tweet.text;
println tweet.mentions;
println tweet.hashtags;

