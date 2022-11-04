package com.bignerdranch.android.sferaprofile.data

import com.github.javafaker.Faker

class PeopleImage {
    private val faker = Faker()
    private val photoUrl = listOf(
        "https://sun9-18.userapi.com/impg/xA46opmQv1wbQj41IiKCWqI8DwegyxKcDYyKOg/g2FVlpIyrAM.jpg?size=384x288&quality=95&sign=cef346c948d2547091d9c430bb77468d&type=album",
        "https://sun1-85.userapi.com/impg/tTv0ICRk_rZ6s5Bj4zm2dLexvwsOFPYffrDnkA/YB3vwrqAP0A.jpg?size=1500x2004&quality=95&sign=c4e2dca00bc427fdb913bfc29851ed53&type=album",
        "https://sun9-82.userapi.com/impg/_6O0hZRyhN3rZnB5Wr061PaM0sp8-3AKV4q6aA/qDLfaqe0qNE.jpg?size=1920x1080&quality=95&sign=69d15b9c9b3bf159b2b9eeff7d5424a5&type=album",
        "https://sun9-78.userapi.com/impg/2CZLX6M9wn7SQ1wnV18bwXh4KXywEbJ6ehqBtg/HRwzNRDQ_fI.jpg?size=2560x1404&quality=95&sign=fd4f0522e0953f1c92152e30ad2eba36&type=album",
        "https://sun9-10.userapi.com/impg/gITDHVytLoieW1R8zitJn21tDYyzKP7bL9Tlbg/noZpuJEDrcw.jpg?size=1015x1450&quality=95&sign=f5794b7c0b322a617b59bf8f2e5f17c2&type=album",
        "https://sun9-87.userapi.com/impg/uGycJv4n6OYiyQOy_2NLWXFbGxSLcR5h1VBalg/7tlMXEmbQd0.jpg?size=987x1200&quality=95&sign=1e64ef0915c6442d156ac956180f1df2&type=album",
        "https://sun9-73.userapi.com/impg/GhPvuG9YAxOzlYytiOzwRJIl9vtAQhRxRxJCTA/ig2AXD3pCNk.jpg?size=612x1080&quality=95&sign=0cf08334eb2c2afe15f45ede018496dd&type=album",
        "https://sun9-69.userapi.com/impg/BccsBBwdvOz_kvBBvzpIEKW4k9OZkz400GqFVw/Ou72wHbmC9Y.jpg?size=728x1080&quality=95&sign=d9de3e8b9ab4486b0d9727a438776a9b&type=album",
        "https://sun9-40.userapi.com/impg/R4N-nLMl-z_CCCeM_l_pGvKnWH73iXh5Uk4xrA/MOioGPGHU_8.jpg?size=767x1024&quality=95&sign=17a17ccec7293024cab356959ebb3b5c&type=album",
        "https://sun9-83.userapi.com/impg/ofJEhX6Qat2o8uPObVOKUkr30l7VITrQSw9_0A/kyPoyqUASh0.jpg?size=597x960&quality=95&sign=e1d38ebd2962ec503dc99d930dd6ad44&type=album"
    )

    fun getPersonList(): List<PeopleData> {

        var counter = 0
        val list = mutableListOf<PeopleData>()
        for (i in 1..40) {
            if (counter < 9) {
                list.add(
                    PeopleData(
                        Name = faker.name().fullName(),
                        photoUrl = photoUrl[counter],
                        Subscribe = false,
                        id = i
                    )
                )
                counter++
            } else {
                list.add(
                    PeopleData(
                        Name = faker.name().fullName(),
                        photoUrl = photoUrl[counter],
                        Subscribe = false,
                        id = i
                    )
                )
                counter = 0
            }

        }
        return list
    }
}