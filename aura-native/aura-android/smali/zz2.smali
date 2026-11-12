.class public final synthetic Lzz2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:La03;


# direct methods
.method public synthetic constructor <init>(La03;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzz2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lzz2;->o:La03;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lzz2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lzz2;->o:La03;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La03;->v:Lb03;

    .line 14
    .line 15
    iget-object v1, v0, Lb03;->r:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcx3;->c()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Artist;->getId()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v1, "MUSIC_DIRECTORY_ID"

    .line 32
    .line 33
    invoke-virtual {p1, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, v0, Lb03;->q:Lcom/eddyizm/tempus/ui/fragment/IndexFragment;

    .line 37
    .line 38
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMusicIndexPlay(Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_0
    invoke-virtual {p0}, La03;->s()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_1
    invoke-virtual {p0}, La03;->s()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
