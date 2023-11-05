package com.betty.playerstore.data

import com.betty.playerstore.model.App

class DataSource {
    fun loadSocialApp(): List<App> {
        return listOf(
            App("Facebook", 0, 4.6f, false),
            App("Instagram", 0, 4.7f, false),
            App("Twitter", 0, 4.5f, false),
            App("Youtube", 0, 4.8f, false),
            App("Tiktok", 0, 4.4f, false),
            App("Snapchat", 0, 4.3f, false),
            App("Pinterest", 0, 4.2f, false),
            App("LinkedIn", 0, 4.1f, false),
            App("Reddit", 0, 4.0f, false),
            App("Tumblr", 0, 3.9f, false),
            App("Quora", 0, 3.8f, false),
            App("Flickr", 0, 3.7f, false),
            App("Meetup", 0, 3.6f, false),
            App("VK", 0, 3.5f, false),
            App("Telegram", 0, 3.4f, false),
            App("WhatsApp", 0, 3.3f, false),
            App("Messenger", 0, 3.2f, false),
            App("Skype", 0, 3.1f, false),
            App("Viber", 0, 3.0f, false),
            App("WeChat", 0, 2.9f, false),
            App("LINE", 0, 2.8f, false),
            App("KakaoTalk", 0, 2.7f, false),
            App("Badoo", 0, 2.6f, false),
            App("Tango", 0, 2.5f, false),
            App("Bumble", 0, 2.4f, false),
            App("Hinge", 0, 2.3f, false),
            App("Grindr", 0, 2.2f, false),
            App("OkCupid", 0, 2.1f, false),
            App("Happn", 0, 2.0f, false),
            App("Coffee Meets Bagel", 0, 1.9f, false),
        )
    }

    fun loadProductivityApp(): List<App> {
        return listOf(
            App("Google Drive", 0, 4.6f, false),
            App("Microsoft Word", 0, 4.7f, false),
            App("Microsoft Excel", 0, 4.5f, false),
            App("Microsoft PowerPoint", 0, 4.8f, false),
            App("Microsoft OneNote", 0, 4.4f, false),
            App("Microsoft Outlook", 0, 4.3f, false),
            App("Microsoft OneDrive", 0, 4.2f, false),
        )
    }

    fun loadPopularApp(): List<App> {
        return listOf(
            App("Tiktok", 0, 4.4f, false),
            App("Facebook", 0, 4.6f, false),
            App("Youtube", 0, 4.8f, false),
            App("Instagram", 0, 4.7f, false),
            App("Twitter", 0, 4.5f, false),
        )
    }

    fun loadGame(): List<App> {
        return listOf(
            App("PUBG Mobile", 0, 4.4f, false),
            App("Mobile Legends", 0, 4.6f, false),
            App("Free Fire", 0, 4.8f, false),
            App("Call of Duty", 0, 4.7f, false),
            App("Clash of Clans", 0, 4.5f, false),
        )
    }
}