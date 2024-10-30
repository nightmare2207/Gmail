package com.example.gmail



data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)

class EmailBuilder{
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build() : Email = Email(user, subject, preview,date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails():MutableList<Email> = mutableListOf(
    email {
        user = "Facebook"
        subject = "test"
        preview = "test"
        date = "26 jun"
        stared = false
    },
    email {
        user = "Instagram"
        subject = "dang ky"
        preview = "ban tao tai khoan thanh cong"
        date = "12 jun"
        stared = true
    },
    email {
        user = "F88"
        subject = "dang ky"
        preview = "chuc mung ban da duoc 1000000$"
        date = "23 aug"
        stared = true
    },
    email {
        user = "danglol240"
        subject = "Confirm trung tuyen"
        preview = "trung tuyen"
        date = "23 feb"
        stared = false
    },
    email {
        user = "mai quoc dat"
        subject = "nhac nho"
        preview = "di hoc di em"
        date = "22 jun"
        stared = true
    },
    email {
        user = "lemanh@gmail.com"
        subject = "ban bia"
        preview = "tra tien cuoc di em"
        date = "21 jun"
        stared = false
        unread = true
    },
    email {
        user = "ngocle@sis.hust"
        subject = "xinchao"
        preview = "chao mung ban den voi hust "
        date = "16 jun"
        stared = true
    } ,
    email {
        user = "tao tuan linh"
        subject = "thu cam on"
        preview = "cam on vi da ho tro "
        date = "16 jun"
        stared = true
    },
    email {
        user = "quach khai linh"
        subject = "hello"
        preview = "an xien ban khong em"
        date = "16 jun"
        stared = true
    }
)