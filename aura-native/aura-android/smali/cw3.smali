.class public final Lcw3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcw3;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lcx3;Ln50;Ln50;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lcx3;->p(Z)V

    .line 3
    .line 4
    .line 5
    iget-object p0, p0, Lcw3;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Ljw3;

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Lpl0;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v3, p2, Ln50;->a:I

    .line 18
    .line 19
    iget v5, p3, Ln50;->a:I

    .line 20
    .line 21
    if-ne v3, v5, :cond_1

    .line 22
    .line 23
    iget v0, p2, Ln50;->b:I

    .line 24
    .line 25
    iget v2, p3, Ln50;->b:I

    .line 26
    .line 27
    if-eq v0, v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v2, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    iget v4, p2, Ln50;->b:I

    .line 33
    .line 34
    iget v6, p3, Ln50;->b:I

    .line 35
    .line 36
    move-object v2, p1

    .line 37
    invoke-virtual/range {v1 .. v6}, Lpl0;->g(Lcx3;IIII)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    goto :goto_2

    .line 42
    :goto_1
    invoke-virtual {v1, v2}, Lpl0;->l(Lcx3;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v2, Lcx3;->a:Landroid/view/View;

    .line 46
    .line 47
    const/4 p2, 0x0

    .line 48
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 49
    .line 50
    .line 51
    iget-object p1, v1, Lpl0;->i:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    :goto_2
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->Y()V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public b(Lcx3;Ln50;Ln50;)V
    .locals 7

    .line 1
    iget-object p0, p0, Lcw3;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->p:Lhm2;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lhm2;->l(Lcx3;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->h(Lcx3;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p1, v0}, Lcx3;->p(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:Ljw3;

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Lpl0;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget v3, p2, Ln50;->a:I

    .line 24
    .line 25
    iget v4, p2, Ln50;->b:I

    .line 26
    .line 27
    iget-object p2, p1, Lcx3;->a:Landroid/view/View;

    .line 28
    .line 29
    if-nez p3, :cond_0

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    :goto_0
    move v5, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget v0, p3, Ln50;->a:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    if-nez p3, :cond_1

    .line 41
    .line 42
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    :goto_2
    move v6, p3

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    iget p3, p3, Ln50;->b:I

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :goto_3
    invoke-virtual {p1}, Lcx3;->j()Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-nez p3, :cond_2

    .line 56
    .line 57
    if-ne v3, v5, :cond_3

    .line 58
    .line 59
    if-eq v4, v6, :cond_2

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_2
    move-object v2, p1

    .line 63
    goto :goto_5

    .line 64
    :cond_3
    :goto_4
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    add-int/2addr p3, v5

    .line 69
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    add-int/2addr v0, v6

    .line 74
    invoke-virtual {p2, v5, v6, p3, v0}, Landroid/view/View;->layout(IIII)V

    .line 75
    .line 76
    .line 77
    move-object v2, p1

    .line 78
    invoke-virtual/range {v1 .. v6}, Lpl0;->g(Lcx3;IIII)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    goto :goto_6

    .line 83
    :goto_5
    invoke-virtual {v1, v2}, Lpl0;->l(Lcx3;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, v1, Lpl0;->h:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x1

    .line 92
    :goto_6
    if-eqz p1, :cond_4

    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->Y()V

    .line 95
    .line 96
    .line 97
    :cond_4
    return-void
.end method
