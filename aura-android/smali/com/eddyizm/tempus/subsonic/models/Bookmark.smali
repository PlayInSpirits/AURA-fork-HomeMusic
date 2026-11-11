.class public final Lcom/eddyizm/tempus/subsonic/models/Bookmark;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private changed:Ljava/util/Date;

.field private comment:Ljava/lang/String;

.field private created:Ljava/util/Date;

.field private entry:Lcom/eddyizm/tempus/subsonic/models/Child;

.field private position:J

.field private username:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getChanged()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->changed:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getComment()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->comment:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreated()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->created:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getEntry()Lcom/eddyizm/tempus/subsonic/models/Child;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->entry:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPosition()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->position:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setChanged(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->changed:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setComment(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->comment:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCreated(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->created:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setEntry(Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->entry:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 2
    .line 3
    return-void
.end method

.method public final setPosition(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->position:J

    .line 2
    .line 3
    return-void
.end method

.method public final setUsername(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
