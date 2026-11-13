.class public final synthetic Ldefpackage/cn3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/dn3;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/dn3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/cn3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/cn3;->o:Ldefpackage/dn3;

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
    iget p1, p0, Ldefpackage/cn3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/cn3;->o:Ldefpackage/dn3;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ldefpackage/dn3;->v:Ldefpackage/en3;

    .line 9
    .line 10
    iget-object v0, p1, Ldefpackage/en3;->r:Ljava/util/List;

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
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getStatus()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "completed"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    new-instance v0, Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v1, p1, Ldefpackage/en3;->r:Ljava/util/List;

    .line 40
    .line 41
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Landroid/os/Parcelable;

    .line 50
    .line 51
    const-string v1, "PODCAST_OBJECT"

    .line 52
    .line 53
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p1, Ldefpackage/en3;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 57
    .line 58
    invoke-interface {p0, v0}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onPodcastEpisodeAltClick(Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void

    .line 62
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/dn3;->t()Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_1
    invoke-virtual {p0}, Ldefpackage/dn3;->s()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_2
    invoke-virtual {p0}, Ldefpackage/dn3;->s()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
