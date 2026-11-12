.class public final Lvi;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

.field public final r:Z

.field public final s:Z

.field public t:I

.field public u:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x190

    .line 5
    .line 6
    iput v0, p0, Lvi;->t:I

    .line 7
    .line 8
    iput-object p1, p0, Lvi;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, p0, Lvi;->r:Z

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput-boolean p1, p0, Lvi;->s:Z

    .line 21
    .line 22
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 23
    .line 24
    iput-object p1, p0, Lvi;->u:Ljava/util/List;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lvi;->u:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final g(Lcx3;I)V
    .locals 3

    .line 1
    check-cast p1, Lui;

    .line 2
    .line 3
    iget-object v0, p1, Lui;->u:Lyc5;

    .line 4
    .line 5
    iget-object v1, v0, Lyc5;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Lvi;->t:I

    .line 14
    .line 15
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 16
    .line 17
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 18
    .line 19
    iget-object v2, v0, Lyc5;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lvi;->u:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 33
    .line 34
    iget-object p2, v0, Lyc5;->p:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p2, Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getCoverArtId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    if-eqz p0, :cond_0

    .line 60
    .line 61
    invoke-static {}, Lud3;->t()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v1, p0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 v1, 0x0

    .line 71
    :goto_0
    const/4 v2, 0x3

    .line 72
    invoke-static {p1, p0, v2, p2, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {}, Lud3;->R()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_1

    .line 89
    .line 90
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Lvz3;

    .line 95
    .line 96
    :cond_1
    iget-object p1, v0, Lyc5;->o:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Landroid/widget/ImageView;

    .line 99
    .line 100
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 3

    .line 1
    const p2, 0x7f0d00a9

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {p1, p2, p1, v0}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const v0, 0x7f0a00e8

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroid/widget/ImageView;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const v0, 0x7f0a00ef

    .line 21
    .line 22
    .line 23
    invoke-static {p2, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/widget/TextView;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    new-instance v0, Lyc5;

    .line 32
    .line 33
    check-cast p2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p2, v0, Lyc5;->n:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, v0, Lyc5;->o:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v2, v0, Lyc5;->p:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-static {}, Lut4;->c()Lut4;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p2, v1}, Lut4;->b(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lut4;->c()Lut4;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p2, p1}, Lut4;->d(Landroid/content/Context;)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iput p1, p0, Lvi;->t:I

    .line 68
    .line 69
    new-instance p1, Lui;

    .line 70
    .line 71
    invoke-direct {p1, p0, v0}, Lui;-><init>(Lvi;Lyc5;)V

    .line 72
    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const-string p1, "Missing required view with ID: "

    .line 84
    .line 85
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    return-object p0
.end method
