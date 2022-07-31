package task1

open class Attachment (open val type:String){

}

class AttachmentPhoto(type: String, photo:Photo) : Attachment(type) {
    override val type = "Photo"
}

class AttachmentVideo(type: String, video: Video) : Attachment(type) {
    override val type = "Video"
}

class AttachmentAudio(type: String, audio: Audio) : Attachment(type) {
    override val type = "Audio"
}

class AttachmentDocument(type: String, document: Document) : Attachment(type) {
    override val type = "Document"
}

class AttachmentArchive(type: String, archive: Archive) : Attachment(type) {
    override val type = "Archive"
}