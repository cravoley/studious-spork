package section.four.grapes

@Grapes(
        @Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.4')
)

import org.apache.commons.lang3.text.*;


println WordUtils.capitalizeFully("awdawd");

println 1.intValue()