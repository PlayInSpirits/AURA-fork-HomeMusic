.class public final Loo1;
.super Le22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic f:I

.field public g:I

.field public h:I

.field public i:I

.field public final synthetic j:Lkc1;


# direct methods
.method public constructor <init>(Lpo1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Loo1;->f:I

    .line 18
    iput-object p1, p0, Loo1;->j:Lkc1;

    invoke-direct {p0, v0}, Le22;-><init>(I)V

    const/4 p1, -0x1

    .line 19
    iput p1, p0, Loo1;->g:I

    .line 20
    iput p1, p0, Loo1;->h:I

    .line 21
    iput p1, p0, Loo1;->i:I

    return-void
.end method

.method public constructor <init>(Lwk3;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Loo1;->f:I

    .line 3
    .line 4
    iput-object p1, p0, Loo1;->j:Lkc1;

    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    invoke-direct {p0, p1}, Le22;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, -0x1

    .line 11
    iput p1, p0, Loo1;->g:I

    .line 12
    .line 13
    iput p1, p0, Loo1;->h:I

    .line 14
    .line 15
    iput p1, p0, Loo1;->i:I

    .line 16
    .line 17
    return-void
.end method

.method private final j(Lcx3;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/RecyclerView;Lcx3;)V
    .locals 9

    .line 1
    iget v0, p0, Loo1;->f:I

    .line 2
    .line 3
    iget-object v1, p0, Loo1;->j:Lkc1;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Le22;->a(Landroidx/recyclerview/widget/RecyclerView;Lcx3;)V

    .line 10
    .line 11
    .line 12
    iget v5, p0, Loo1;->g:I

    .line 13
    .line 14
    if-eq v5, v2, :cond_1

    .line 15
    .line 16
    iget p1, p0, Loo1;->h:I

    .line 17
    .line 18
    if-eq p1, v2, :cond_1

    .line 19
    .line 20
    iget v6, p0, Loo1;->i:I

    .line 21
    .line 22
    if-eq v6, v2, :cond_1

    .line 23
    .line 24
    check-cast v1, Lwk3;

    .line 25
    .line 26
    iget-object v4, v1, Lwk3;->v0:Lbl2;

    .line 27
    .line 28
    iget-object p1, v1, Lwk3;->w0:Lyk3;

    .line 29
    .line 30
    iget-object v7, p1, Lyk3;->s:Ljava/util/List;

    .line 31
    .line 32
    sget-object p1, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    const-string p1, "move"

    .line 35
    .line 36
    invoke-static {p1, v5, v6}, Lu52;->q(Ljava/lang/String;II)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    if-eqz v4, :cond_1

    .line 44
    .line 45
    new-instance v3, Lvn2;

    .line 46
    .line 47
    const/4 v8, 0x2

    .line 48
    invoke-direct/range {v3 .. v8}, Lvn2;-><init>(Lbl2;IILjava/util/List;I)V

    .line 49
    .line 50
    .line 51
    sget-object p1, Lgq0;->n:Lgq0;

    .line 52
    .line 53
    invoke-virtual {v4, v3, p1}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    iput v2, p0, Loo1;->g:I

    .line 57
    .line 58
    iput v2, p0, Loo1;->h:I

    .line 59
    .line 60
    iput v2, p0, Loo1;->i:I

    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_0
    invoke-super {p0, p1, p2}, Le22;->a(Landroidx/recyclerview/widget/RecyclerView;Lcx3;)V

    .line 64
    .line 65
    .line 66
    check-cast v1, Lpo1;

    .line 67
    .line 68
    iget-object p1, v1, Lpo1;->C0:Lcom/eddyizm/tempus/viewmodel/a;

    .line 69
    .line 70
    iget-object p2, v1, Lpo1;->D0:Lro1;

    .line 71
    .line 72
    iget-object p2, p2, Lro1;->q:Ljava/util/List;

    .line 73
    .line 74
    iput-object p2, p1, Lcom/eddyizm/tempus/viewmodel/a;->c:Ljava/util/List;

    .line 75
    .line 76
    iput v2, p0, Loo1;->g:I

    .line 77
    .line 78
    iput v2, p0, Loo1;->h:I

    .line 79
    .line 80
    iput v2, p0, Loo1;->i:I

    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Landroidx/recyclerview/widget/RecyclerView;Lcx3;Lcx3;)Z
    .locals 4

    .line 1
    iget v0, p0, Loo1;->f:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Loo1;->j:Lkc1;

    .line 5
    .line 6
    const/4 v3, -0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget v0, p0, Loo1;->g:I

    .line 11
    .line 12
    if-ne v0, v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p2}, Lcx3;->c()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, Loo1;->g:I

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2}, Lcx3;->c()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput p2, p0, Loo1;->h:I

    .line 25
    .line 26
    invoke-virtual {p3}, Lcx3;->c()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    iput p2, p0, Loo1;->i:I

    .line 31
    .line 32
    check-cast v2, Lwk3;

    .line 33
    .line 34
    iget-object p3, v2, Lwk3;->w0:Lyk3;

    .line 35
    .line 36
    iget-object p3, p3, Lyk3;->s:Ljava/util/List;

    .line 37
    .line 38
    iget v0, p0, Loo1;->h:I

    .line 39
    .line 40
    invoke-static {p3, v0, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget p2, p0, Loo1;->h:I

    .line 48
    .line 49
    iget p0, p0, Loo1;->i:I

    .line 50
    .line 51
    iget-object p1, p1, Ldw3;->n:Lew3;

    .line 52
    .line 53
    invoke-virtual {p1, p2, p0}, Lew3;->c(II)V

    .line 54
    .line 55
    .line 56
    return v1

    .line 57
    :pswitch_0
    iget v0, p0, Loo1;->g:I

    .line 58
    .line 59
    if-ne v0, v3, :cond_1

    .line 60
    .line 61
    invoke-virtual {p2}, Lcx3;->c()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iput v0, p0, Loo1;->g:I

    .line 66
    .line 67
    :cond_1
    invoke-virtual {p2}, Lcx3;->c()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    iput p2, p0, Loo1;->h:I

    .line 72
    .line 73
    invoke-virtual {p3}, Lcx3;->c()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    iput p2, p0, Loo1;->i:I

    .line 78
    .line 79
    check-cast v2, Lpo1;

    .line 80
    .line 81
    iget-object p3, v2, Lpo1;->D0:Lro1;

    .line 82
    .line 83
    iget-object p3, p3, Lro1;->q:Ljava/util/List;

    .line 84
    .line 85
    iget v0, p0, Loo1;->h:I

    .line 86
    .line 87
    invoke-static {p3, v0, p2}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget p2, p0, Loo1;->h:I

    .line 98
    .line 99
    iget p0, p0, Loo1;->i:I

    .line 100
    .line 101
    iget-object p1, p1, Ldw3;->n:Lew3;

    .line 102
    .line 103
    invoke-virtual {p1, p2, p0}, Lew3;->c(II)V

    .line 104
    .line 105
    .line 106
    return v1

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lcx3;)V
    .locals 4

    .line 1
    iget v0, p0, Loo1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Loo1;->j:Lkc1;

    .line 7
    .line 8
    check-cast p0, Lwk3;

    .line 9
    .line 10
    iget-object v0, p0, Lwk3;->v0:Lbl2;

    .line 11
    .line 12
    iget-object p0, p0, Lwk3;->w0:Lyk3;

    .line 13
    .line 14
    iget-object p0, p0, Lyk3;->s:Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcx3;->c()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sget-object v2, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 21
    .line 22
    add-int/lit8 v2, v1, 0x1

    .line 23
    .line 24
    const-string v3, "remove"

    .line 25
    .line 26
    invoke-static {v3, v1, v2}, Lu52;->q(Ljava/lang/String;II)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    if-eqz v0, :cond_1

    .line 34
    .line 35
    new-instance v2, Lgk;

    .line 36
    .line 37
    const/4 v3, 0x7

    .line 38
    invoke-direct {v2, v0, v1, p0, v3}, Lgk;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lgq0;->n:Lgq0;

    .line 42
    .line 43
    invoke-virtual {v0, v2, p0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_0
    iget-object p0, p1, Lcx3;->s:Ldw3;

    .line 47
    .line 48
    invoke-virtual {p0}, Ldw3;->d()V

    .line 49
    .line 50
    .line 51
    :pswitch_0
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
