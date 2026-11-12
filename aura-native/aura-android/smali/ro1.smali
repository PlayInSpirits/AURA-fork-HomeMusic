.class public final Lro1;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public q:Ljava/util/List;


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lro1;->q:Ljava/util/List;

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
    .locals 1

    .line 1
    check-cast p1, Lqo1;

    .line 2
    .line 3
    iget-object p0, p0, Lro1;->q:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/eddyizm/tempus/model/HomeSector;

    .line 10
    .line 11
    iget-object p1, p1, Lqo1;->u:Lrf2;

    .line 12
    .line 13
    iget-object p2, p1, Lrf2;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Landroid/widget/CheckBox;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/HomeSector;->getSectorTitle()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p1, Lrf2;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroid/widget/CheckBox;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/HomeSector;->isVisible()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-virtual {p1, p0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 1

    .line 1
    const p2, 0x7f0d00a1

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
    const p2, 0x7f0a02c2

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/widget/ImageView;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const p2, 0x7f0a02c3

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/widget/CheckBox;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance p2, Lrf2;

    .line 32
    .line 33
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    .line 35
    invoke-direct {p2, p1, v0}, Lrf2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Lqo1;

    .line 39
    .line 40
    invoke-direct {p1, p0, p2}, Lqo1;-><init>(Lro1;Lrf2;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, "Missing required view with ID: "

    .line 53
    .line 54
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    return-object p0
.end method
