.class public final Lb03;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lcom/eddyizm/tempus/ui/fragment/IndexFragment;

.field public r:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/IndexFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb03;->q:Lcom/eddyizm/tempus/ui/fragment/IndexFragment;

    .line 5
    .line 6
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object p1, p0, Lb03;->r:Ljava/util/List;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lb03;->r:Ljava/util/List;

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

.method public final g(Lcx3;I)V
    .locals 3

    .line 1
    check-cast p1, La03;

    .line 2
    .line 3
    iget-object p0, p0, Lb03;->r:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 10
    .line 11
    iget-object p2, p1, La03;->u:Lz12;

    .line 12
    .line 13
    iget-object v0, p2, Lz12;->e:Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Artist;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Artist;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-static {}, Lud3;->t()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1, p0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v1, 0x0

    .line 48
    :goto_0
    const/4 v2, 0x5

    .line 49
    invoke-static {p1, p0, v2, v0, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {}, Lud3;->R()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Lvz3;

    .line 72
    .line 73
    :cond_1
    iget-object p1, p2, Lz12;->b:Landroid/widget/ImageView;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 7

    .line 1
    const p2, 0x7f0d00b1

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {p1, p2, p1, v0}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const p2, 0x7f0a0408

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, Landroid/widget/ImageView;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const p2, 0x7f0a0409

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, Landroid/widget/ImageView;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    const p2, 0x7f0a040a

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v5, v0

    .line 41
    check-cast v5, Landroid/widget/ImageView;

    .line 42
    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    const p2, 0x7f0a040b

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v6, v0

    .line 53
    check-cast v6, Landroid/widget/TextView;

    .line 54
    .line 55
    if-eqz v6, :cond_0

    .line 56
    .line 57
    new-instance v1, Lz12;

    .line 58
    .line 59
    move-object v2, p1

    .line 60
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 61
    .line 62
    invoke-direct/range {v1 .. v6}, Lz12;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, La03;

    .line 66
    .line 67
    invoke-direct {p1, p0, v1}, La03;-><init>(Lb03;Lz12;)V

    .line 68
    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string p1, "Missing required view with ID: "

    .line 80
    .line 81
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    return-object p0
.end method
