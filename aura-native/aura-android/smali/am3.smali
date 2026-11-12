.class public final synthetic Lam3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

.field public final synthetic p:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p3, p0, Lam3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lam3;->o:Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 4
    .line 5
    iput-object p2, p0, Lam3;->p:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1
    iget p1, p0, Lam3;->n:I

    .line 2
    .line 3
    iget-object v0, p0, Lam3;->p:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, Lam3;->o:Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Lim3;

    .line 11
    .line 12
    iget-object p1, p1, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lv13;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Lim3;

    .line 25
    .line 26
    iget-object v2, v2, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v3, Lqo2;

    .line 33
    .line 34
    const/4 v4, 0x5

    .line 35
    invoke-direct {v3, p0, v0, p1, v4}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1, p1, v2, v0, v3}, Lcom/eddyizm/tempus/homemusic/a;->m(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->r0:Lbl2;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Lim3;

    .line 45
    .line 46
    iget-object v1, v1, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Lv13;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-static {p1, v0, v2, v1}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 61
    .line 62
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 63
    .line 64
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Lau;

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    invoke-virtual {p0, p1}, Lau;->d(Z)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
