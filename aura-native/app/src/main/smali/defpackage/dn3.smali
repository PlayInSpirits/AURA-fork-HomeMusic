.class public final Ldefpackage/dn3;
.super Ldefpackage/cx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Ldefpackage/w12;

.field public final synthetic v:Ldefpackage/en3;


# direct methods
.method public constructor <init>(Ldefpackage/en3;Ldefpackage/w12;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ldefpackage/dn3;->v:Ldefpackage/en3;

    .line 2
    .line 3
    iget-object p1, p2, Ldefpackage/w12;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/dn3;->u:Ldefpackage/w12;

    .line 11
    .line 12
    new-instance v0, Ldefpackage/cn3;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, Ldefpackage/cn3;-><init>(Ldefpackage/dn3;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Ldefpackage/q6;

    .line 22
    .line 23
    const/16 v1, 0x12

    .line 24
    .line 25
    invoke-direct {v0, v1, p0}, Ldefpackage/q6;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p2, Ldefpackage/w12;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Landroid/widget/Button;

    .line 34
    .line 35
    new-instance v0, Ldefpackage/cn3;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, v1}, Ldefpackage/cn3;-><init>(Ldefpackage/dn3;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p2, Ldefpackage/w12;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Landroid/widget/Button;

    .line 47
    .line 48
    new-instance v0, Ldefpackage/cn3;

    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    invoke-direct {v0, p0, v1}, Ldefpackage/cn3;-><init>(Ldefpackage/dn3;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p2, Ldefpackage/w12;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Landroid/widget/Button;

    .line 60
    .line 61
    new-instance p2, Ldefpackage/cn3;

    .line 62
    .line 63
    const/4 v0, 0x3

    .line 64
    invoke-direct {p2, p0, v0}, Ldefpackage/cn3;-><init>(Ldefpackage/dn3;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final s()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/dn3;->v:Ldefpackage/en3;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/en3;->r:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getStatus()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "completed"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v1, Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v2, v0, Ldefpackage/en3;->r:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Landroid/os/Parcelable;

    .line 43
    .line 44
    const-string v2, "PODCAST_OBJECT"

    .line 45
    .line 46
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v0, Ldefpackage/en3;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 50
    .line 51
    invoke-interface {p0, v1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onPodcastEpisodeClick(Landroid/os/Bundle;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final t()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/dn3;->v:Ldefpackage/en3;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/en3;->r:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getStatus()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "completed"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v1, Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v2, v0, Ldefpackage/en3;->r:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Landroid/os/Parcelable;

    .line 43
    .line 44
    const-string v2, "PODCAST_OBJECT"

    .line 45
    .line 46
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v0, Ldefpackage/en3;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 50
    .line 51
    invoke-interface {p0, v1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onPodcastEpisodeLongClick(Landroid/os/Bundle;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x1

    .line 55
    return p0

    .line 56
    :cond_0
    const/4 p0, 0x0

    .line 57
    return p0
.end method
