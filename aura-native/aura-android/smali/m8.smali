.class public final Lm8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/StarCallback;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

.field public final synthetic p:Ln8;


# direct methods
.method public synthetic constructor <init>(Ln8;Lcom/eddyizm/tempus/subsonic/models/AlbumID3;I)V
    .locals 0

    .line 1
    iput p3, p0, Lm8;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lm8;->p:Ln8;

    .line 4
    .line 5
    iput-object p2, p0, Lm8;->o:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onError()V
    .locals 3

    .line 1
    iget v0, p0, Lm8;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lm8;->o:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lm8;->p:Ln8;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Ln8;->e:Ld34;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {p0, v2, v0, v1, v2}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object p0, p0, Ln8;->e:Ld34;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p0, v2, v0, v1, v2}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
