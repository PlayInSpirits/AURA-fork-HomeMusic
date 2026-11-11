.class public Lxg0;
.super Lpw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Landroidx/recyclerview/widget/RecyclerView;

.field public b:Landroid/widget/Scroller;

.field public final c:Lah4;

.field public final synthetic d:I

.field public e:Lib3;

.field public f:Lib3;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxg0;->d:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lah4;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lah4;-><init>(Lxg0;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lxg0;->c:Lah4;

    .line 12
    .line 13
    return-void
.end method

.method public static c(Landroid/view/View;Lqz0;)I
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Lqz0;->g(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, p0}, Lqz0;->e(Landroid/view/View;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    div-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    add-int/2addr p0, v0

    .line 12
    invoke-virtual {p1}, Lqz0;->m()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, Lqz0;->n()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    div-int/lit8 p1, p1, 0x2

    .line 21
    .line 22
    add-int/2addr p1, v0

    .line 23
    sub-int/2addr p0, p1

    .line 24
    return p0
.end method

.method public static e(Lmw3;Lqz0;)Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lmw3;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Lqz0;->m()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1}, Lqz0;->n()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    div-int/lit8 v3, v3, 0x2

    .line 18
    .line 19
    add-int/2addr v3, v2

    .line 20
    const v2, 0x7fffffff

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-ge v4, v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Lmw3;->u(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {p1, v5}, Lqz0;->g(Landroid/view/View;)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p1, v5}, Lqz0;->e(Landroid/view/View;)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    div-int/lit8 v7, v7, 0x2

    .line 39
    .line 40
    add-int/2addr v7, v6

    .line 41
    sub-int/2addr v7, v3

    .line 42
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-ge v6, v2, :cond_1

    .line 47
    .line 48
    move-object v1, v5

    .line 49
    move v2, v6

    .line 50
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-object v1
.end method

.method public static f(Lmw3;Lqz0;)Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lmw3;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Lqz0;->m()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1}, Lqz0;->n()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    div-int/lit8 v3, v3, 0x2

    .line 18
    .line 19
    add-int/2addr v3, v2

    .line 20
    const v2, 0x7fffffff

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-ge v4, v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Lmw3;->u(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {p1, v5}, Lqz0;->g(Landroid/view/View;)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p1, v5}, Lqz0;->e(Landroid/view/View;)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    div-int/lit8 v7, v7, 0x2

    .line 39
    .line 40
    add-int/2addr v7, v6

    .line 41
    sub-int/2addr v7, v3

    .line 42
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-ge v6, v2, :cond_1

    .line 47
    .line 48
    move-object v1, v5

    .line 49
    move v2, v6

    .line 50
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-object v1
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxg0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lxg0;->c:Lah4;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->w0:Ljava/util/ArrayList;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lxg0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Lpw3;)V

    .line 21
    .line 22
    .line 23
    :cond_2
    iput-object p1, p0, Lxg0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    if-eqz p1, :cond_4

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getOnFlingListener()Lpw3;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    iget-object p1, p0, Lxg0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->j(Lrw3;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lxg0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Lpw3;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Landroid/widget/Scroller;

    .line 44
    .line 45
    iget-object v0, p0, Lxg0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lxg0;->b:Landroid/widget/Scroller;

    .line 60
    .line 61
    invoke-virtual {p0}, Lxg0;->l()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    const-string p0, "An instance of OnFlingListener already set."

    .line 66
    .line 67
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_4
    :goto_0
    return-void
.end method

.method public final b(Lmw3;Landroid/view/View;)[I
    .locals 7

    .line 1
    iget v0, p0, Lxg0;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-array v0, v1, [I

    .line 10
    .line 11
    invoke-virtual {p1}, Lmw3;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lxg0;->i(Lmw3;)Lqz0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {p2, v1}, Lxg0;->c(Landroid/view/View;Lqz0;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    aput v1, v0, v2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    aput v2, v0, v2

    .line 29
    .line 30
    :goto_0
    invoke-virtual {p1}, Lmw3;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lxg0;->k(Lmw3;)Lqz0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p2, p0}, Lxg0;->c(Landroid/view/View;Lqz0;)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    aput p0, v0, v3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    aput v2, v0, v3

    .line 48
    .line 49
    :goto_1
    return-object v0

    .line 50
    :pswitch_0
    new-array v0, v1, [I

    .line 51
    .line 52
    invoke-virtual {p1}, Lmw3;->d()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lxg0;->h(Lmw3;)Lqz0;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4, p2}, Lqz0;->g(Landroid/view/View;)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    invoke-virtual {v4, p2}, Lqz0;->e(Landroid/view/View;)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    div-int/2addr v6, v1

    .line 71
    add-int/2addr v6, v5

    .line 72
    invoke-virtual {v4}, Lqz0;->m()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-virtual {v4}, Lqz0;->n()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    div-int/2addr v4, v1

    .line 81
    add-int/2addr v4, v5

    .line 82
    sub-int/2addr v6, v4

    .line 83
    aput v6, v0, v2

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    aput v2, v0, v2

    .line 87
    .line 88
    :goto_2
    invoke-virtual {p1}, Lmw3;->e()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Lxg0;->j(Lmw3;)Lqz0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0, p2}, Lqz0;->g(Landroid/view/View;)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-virtual {p0, p2}, Lqz0;->e(Landroid/view/View;)I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    div-int/2addr p2, v1

    .line 107
    add-int/2addr p2, p1

    .line 108
    invoke-virtual {p0}, Lqz0;->m()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-virtual {p0}, Lqz0;->n()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    div-int/2addr p0, v1

    .line 117
    add-int/2addr p0, p1

    .line 118
    sub-int/2addr p2, p0

    .line 119
    aput p2, v0, v3

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_3
    aput v2, v0, v3

    .line 123
    .line 124
    :goto_3
    return-object v0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lmw3;Lqz0;II)I
    .locals 10

    .line 1
    iget-object v0, p0, Lxg0;->b:Landroid/widget/Scroller;

    .line 2
    .line 3
    const/high16 v7, -0x80000000

    .line 4
    .line 5
    const v8, 0x7fffffff

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    const v6, 0x7fffffff

    .line 13
    .line 14
    .line 15
    move v3, p3

    .line 16
    move v4, p4

    .line 17
    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lxg0;->b:Landroid/widget/Scroller;

    .line 21
    .line 22
    invoke-virtual {p3}, Landroid/widget/Scroller;->getFinalX()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    iget-object p0, p0, Lxg0;->b:Landroid/widget/Scroller;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/widget/Scroller;->getFinalY()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    filled-new-array {p3, p0}, [I

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1}, Lmw3;->v()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    const/4 p4, 0x0

    .line 41
    const/4 v0, 0x1

    .line 42
    const/high16 v1, 0x3f800000    # 1.0f

    .line 43
    .line 44
    if-nez p3, :cond_0

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_0
    const/4 v2, 0x0

    .line 48
    const v3, 0x7fffffff

    .line 49
    .line 50
    .line 51
    const/high16 v4, -0x80000000

    .line 52
    .line 53
    move v6, p4

    .line 54
    move v5, v4

    .line 55
    move v4, v3

    .line 56
    move-object v3, v2

    .line 57
    :goto_0
    if-ge v6, p3, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1, v6}, Lmw3;->u(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v7}, Lmw3;->I(Landroid/view/View;)I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    const/4 v9, -0x1

    .line 68
    if-ne v8, v9, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    if-ge v8, v4, :cond_2

    .line 72
    .line 73
    move-object v2, v7

    .line 74
    move v4, v8

    .line 75
    :cond_2
    if-le v8, v5, :cond_3

    .line 76
    .line 77
    move-object v3, v7

    .line 78
    move v5, v8

    .line 79
    :cond_3
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    if-eqz v2, :cond_7

    .line 83
    .line 84
    if-nez v3, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    invoke-virtual {p2, v2}, Lqz0;->g(Landroid/view/View;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-virtual {p2, v3}, Lqz0;->g(Landroid/view/View;)I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {p2, v2}, Lqz0;->d(Landroid/view/View;)I

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    invoke-virtual {p2, v3}, Lqz0;->d(Landroid/view/View;)I

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    invoke-static {p3, p2}, Ljava/lang/Math;->max(II)I

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    sub-int/2addr p2, p1

    .line 112
    if-nez p2, :cond_6

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_6
    int-to-float p1, p2

    .line 116
    mul-float/2addr p1, v1

    .line 117
    sub-int/2addr v5, v4

    .line 118
    add-int/2addr v5, v0

    .line 119
    int-to-float p2, v5

    .line 120
    div-float v1, p1, p2

    .line 121
    .line 122
    :cond_7
    :goto_2
    const/4 p1, 0x0

    .line 123
    cmpg-float p1, v1, p1

    .line 124
    .line 125
    if-gtz p1, :cond_8

    .line 126
    .line 127
    return p4

    .line 128
    :cond_8
    aget p1, p0, p4

    .line 129
    .line 130
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    aget p2, p0, v0

    .line 135
    .line 136
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-le p1, p2, :cond_9

    .line 141
    .line 142
    aget p0, p0, p4

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_9
    aget p0, p0, v0

    .line 146
    .line 147
    :goto_3
    int-to-float p0, p0

    .line 148
    div-float/2addr p0, v1

    .line 149
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    return p0
.end method

.method public g(Lmw3;)Landroid/view/View;
    .locals 6

    .line 1
    iget v0, p0, Lxg0;->d:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lmw3;->e()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lxg0;->k(Lmw3;)Lqz0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p1, p0}, Lxg0;->f(Lmw3;Lqz0;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Lmw3;->d()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lxg0;->i(Lmw3;)Lqz0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p1, p0}, Lxg0;->f(Lmw3;Lqz0;)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :cond_1
    :goto_0
    return-object v1

    .line 37
    :pswitch_0
    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    move-object v0, p1

    .line 42
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 43
    .line 44
    invoke-virtual {v0}, Lmw3;->v()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v3, 0x0

    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-virtual {v0, v3, v2, v4, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0(IIZZ)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const/4 v5, -0x1

    .line 55
    if-nez v2, :cond_2

    .line 56
    .line 57
    move v2, v5

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {v2}, Lmw3;->I(Landroid/view/View;)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_1
    if-eqz v2, :cond_6

    .line 64
    .line 65
    invoke-virtual {v0}, Lmw3;->v()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    sub-int/2addr v2, v4

    .line 70
    invoke-virtual {v0, v2, v5, v4, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->S0(IIZZ)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v2, :cond_3

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    invoke-static {v2}, Lmw3;->I(Landroid/view/View;)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    :goto_2
    invoke-virtual {v0}, Lmw3;->D()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    sub-int/2addr v0, v4

    .line 86
    if-eq v5, v0, :cond_6

    .line 87
    .line 88
    :cond_4
    invoke-virtual {p1}, Lmw3;->e()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Lxg0;->j(Lmw3;)Lqz0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p1, p0}, Lxg0;->e(Lmw3;Lqz0;)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    invoke-virtual {p1}, Lmw3;->d()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lxg0;->h(Lmw3;)Lqz0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p1, p0}, Lxg0;->e(Lmw3;Lqz0;)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    :cond_6
    :goto_3
    return-object v1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lmw3;)Lqz0;
    .locals 2

    .line 1
    iget-object v0, p0, Lxg0;->f:Lib3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lqz0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lmw3;

    .line 8
    .line 9
    if-eq v0, p1, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lib3;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, v1}, Lib3;-><init>(Lmw3;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lxg0;->f:Lib3;

    .line 18
    .line 19
    :cond_1
    iget-object p0, p0, Lxg0;->f:Lib3;

    .line 20
    .line 21
    return-object p0
.end method

.method public i(Lmw3;)Lqz0;
    .locals 2

    .line 1
    iget-object v0, p0, Lxg0;->f:Lib3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lqz0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lmw3;

    .line 8
    .line 9
    if-eq v0, p1, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lib3;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p1, v1}, Lib3;-><init>(Lmw3;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lxg0;->f:Lib3;

    .line 18
    .line 19
    :cond_1
    iget-object p0, p0, Lxg0;->f:Lib3;

    .line 20
    .line 21
    return-object p0
.end method

.method public j(Lmw3;)Lqz0;
    .locals 2

    .line 1
    iget-object v0, p0, Lxg0;->e:Lib3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lqz0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lmw3;

    .line 8
    .line 9
    if-eq v0, p1, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lib3;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p1, v1}, Lib3;-><init>(Lmw3;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lxg0;->e:Lib3;

    .line 18
    .line 19
    :cond_1
    iget-object p0, p0, Lxg0;->e:Lib3;

    .line 20
    .line 21
    return-object p0
.end method

.method public k(Lmw3;)Lqz0;
    .locals 2

    .line 1
    iget-object v0, p0, Lxg0;->e:Lib3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lqz0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lmw3;

    .line 8
    .line 9
    if-eq v0, p1, :cond_1

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lib3;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p1, v1}, Lib3;-><init>(Lmw3;I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lxg0;->e:Lib3;

    .line 18
    .line 19
    :cond_1
    iget-object p0, p0, Lxg0;->e:Lib3;

    .line 20
    .line 21
    return-object p0
.end method

.method public final l()V
    .locals 5

    .line 1
    iget-object v0, p0, Lxg0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {p0, v0}, Lxg0;->g(Lmw3;)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    invoke-virtual {p0, v0, v1}, Lxg0;->b(Lmw3;Landroid/view/View;)[I

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x0

    .line 25
    aget v2, v0, v1

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-nez v2, :cond_4

    .line 29
    .line 30
    aget v4, v0, v3

    .line 31
    .line 32
    if-eqz v4, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    :goto_0
    return-void

    .line 36
    :cond_4
    :goto_1
    iget-object p0, p0, Lxg0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    aget v0, v0, v3

    .line 39
    .line 40
    invoke-virtual {p0, v2, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->l0(IIZ)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
