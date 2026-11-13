.class public final synthetic Ldefpackage/xz2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/yz2;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/yz2;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/xz2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/xz2;->o:Ldefpackage/yz2;

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
    iget p1, p0, Ldefpackage/xz2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/xz2;->o:Ldefpackage/yz2;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ldefpackage/yz2;->v:Ldefpackage/zd0;

    .line 9
    .line 10
    iget-object v0, p1, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    new-instance v0, Landroid/os/Bundle;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-object v1, p1, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v1, "MUSIC_DIRECTORY_ID"

    .line 50
    .line 51
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p1, Ldefpackage/zd0;->s:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 57
    .line 58
    invoke-interface {p0, v0}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMusicDirectoryPlay(Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void

    .line 62
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/yz2;->s()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_1
    invoke-virtual {p0}, Ldefpackage/yz2;->s()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
