package org.edx.mobile.deeplink

import android.os.Bundle
import org.json.JSONObject

open class DeepLink(val screenName: String) {
    object Keys {
        const val SCREEN_NAME = "screen_name"
        const val COURSE_ID = "course_id"
        const val PATH_ID = "path_id"
        const val TOPIC_ID = "topic_id"
        const val THREAD_ID = "thread_id"
    }

    var courseId: String? = null
    var pathId: String? = null
    var topicID: String? = null
    var threadID: String? = null

    constructor(screenName: String, paramsJson: JSONObject) : this(screenName) {
        courseId = paramsJson.optString(Keys.COURSE_ID)
        pathId = paramsJson.optString(Keys.PATH_ID)
        topicID = paramsJson.optString(Keys.TOPIC_ID)
        threadID = paramsJson.optString(Keys.THREAD_ID)
    }

    constructor(screenName: String, bundle: Bundle) : this(screenName) {
        courseId = bundle.getString(Keys.COURSE_ID)
        pathId = bundle.getString(Keys.PATH_ID)
        topicID = bundle.getString(Keys.TOPIC_ID)
        threadID = bundle.getString(Keys.THREAD_ID)
    }

    constructor(screenName: String, map: Map<String, String>) : this(screenName) {
        courseId = map[Keys.COURSE_ID]
        pathId = map[Keys.PATH_ID]
        topicID = map[Keys.TOPIC_ID]
        threadID = map[Keys.THREAD_ID]
    }

    override fun toString(): String {
        return "DeepLink(screenName='$screenName', courseId=$courseId, pathId=$pathId, topicID=$topicID, threadID=$threadID)"
    }
}
