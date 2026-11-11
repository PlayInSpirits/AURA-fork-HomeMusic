.class public final Luj;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/StarCallback;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lwj;


# direct methods
.method public synthetic constructor <init>(Lwj;I)V
    .locals 0

    .line 1
    iput p2, p0, Luj;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Luj;->o:Lwj;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onError()V
    .locals 3

    .line 1
    iget v0, p0, Luj;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Luj;->o:Lwj;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lwj;->d:Ld34;

    .line 10
    .line 11
    iget-object p0, p0, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v0, v1, v1, v2, p0}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Lwj;->d:Ld34;

    .line 23
    .line 24
    iget-object p0, p0, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {v0, v1, v1, v2, p0}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
