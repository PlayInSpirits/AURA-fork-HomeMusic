.class public Ldefpackage/fg4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final h:Ldefpackage/n7;

.field public static final i:Ldefpackage/n7;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/n7;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/n7;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/fg4;->h:Ldefpackage/n7;

    .line 9
    .line 10
    new-instance v0, Ldefpackage/n7;

    .line 11
    .line 12
    const/16 v1, 0x15

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ldefpackage/n7;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ldefpackage/fg4;->i:Ldefpackage/n7;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/fg4;->a:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    .line 35
    new-array v0, v0, [Ldefpackage/eg4;

    iput-object v0, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 37
    iput v0, p0, Ldefpackage/fg4;->b:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/fg4;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Ldefpackage/fg4;->b:I

    .line 8
    .line 9
    if-lez p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ldefpackage/si1;

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    invoke-direct {p1, v0}, Ldefpackage/si1;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance p1, Ldefpackage/tv1;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p0, "maxSize <= 0"

    .line 28
    .line 29
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method

.method public constructor <init>(ILdefpackage/il;IIILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ldefpackage/fg4;->a:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput p1, p0, Ldefpackage/fg4;->b:I

    .line 40
    iput-object p2, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 41
    iput p3, p0, Ldefpackage/fg4;->c:I

    .line 42
    iput p4, p0, Ldefpackage/fg4;->d:I

    .line 43
    iput p5, p0, Ldefpackage/fg4;->e:I

    .line 44
    iput-object p6, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ldefpackage/fg4;->a:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 46
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    const/high16 p1, -0x80000000

    .line 47
    iput p1, p0, Ldefpackage/fg4;->b:I

    .line 48
    iput p1, p0, Ldefpackage/fg4;->c:I

    const/4 p1, 0x0

    .line 49
    iput p1, p0, Ldefpackage/fg4;->d:I

    .line 50
    iput p2, p0, Ldefpackage/fg4;->e:I

    return-void
.end method


# virtual methods
.method public a(IF)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [Ldefpackage/eg4;

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget v2, p0, Ldefpackage/fg4;->b:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v2, v3, :cond_0

    .line 13
    .line 14
    sget-object v2, Ldefpackage/fg4;->h:Ldefpackage/n7;

    .line 15
    .line 16
    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 17
    .line 18
    .line 19
    iput v3, p0, Ldefpackage/fg4;->b:I

    .line 20
    .line 21
    :cond_0
    iget v2, p0, Ldefpackage/fg4;->e:I

    .line 22
    .line 23
    if-lez v2, :cond_1

    .line 24
    .line 25
    sub-int/2addr v2, v3

    .line 26
    iput v2, p0, Ldefpackage/fg4;->e:I

    .line 27
    .line 28
    aget-object v2, v0, v2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    new-instance v2, Ldefpackage/eg4;

    .line 32
    .line 33
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget v3, p0, Ldefpackage/fg4;->c:I

    .line 37
    .line 38
    add-int/lit8 v4, v3, 0x1

    .line 39
    .line 40
    iput v4, p0, Ldefpackage/fg4;->c:I

    .line 41
    .line 42
    iput v3, v2, Ldefpackage/eg4;->a:I

    .line 43
    .line 44
    iput p1, v2, Ldefpackage/eg4;->b:I

    .line 45
    .line 46
    iput p2, v2, Ldefpackage/eg4;->c:F

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    iget p2, p0, Ldefpackage/fg4;->d:I

    .line 52
    .line 53
    add-int/2addr p2, p1

    .line 54
    iput p2, p0, Ldefpackage/fg4;->d:I

    .line 55
    .line 56
    :cond_2
    :goto_1
    iget p1, p0, Ldefpackage/fg4;->d:I

    .line 57
    .line 58
    const/16 p2, 0x7d0

    .line 59
    .line 60
    if-le p1, p2, :cond_4

    .line 61
    .line 62
    add-int/lit16 p1, p1, -0x7d0

    .line 63
    .line 64
    const/4 p2, 0x0

    .line 65
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ldefpackage/eg4;

    .line 70
    .line 71
    iget v3, v2, Ldefpackage/eg4;->b:I

    .line 72
    .line 73
    if-gt v3, p1, :cond_3

    .line 74
    .line 75
    iget p1, p0, Ldefpackage/fg4;->d:I

    .line 76
    .line 77
    sub-int/2addr p1, v3

    .line 78
    iput p1, p0, Ldefpackage/fg4;->d:I

    .line 79
    .line 80
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    iget p1, p0, Ldefpackage/fg4;->e:I

    .line 84
    .line 85
    const/4 p2, 0x5

    .line 86
    if-ge p1, p2, :cond_2

    .line 87
    .line 88
    add-int/lit8 p2, p1, 0x1

    .line 89
    .line 90
    iput p2, p0, Ldefpackage/fg4;->e:I

    .line 91
    .line 92
    aput-object v2, v0, p1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    sub-int/2addr v3, p1

    .line 96
    iput v3, v2, Ldefpackage/eg4;->b:I

    .line 97
    .line 98
    iget p2, p0, Ldefpackage/fg4;->d:I

    .line 99
    .line 100
    sub-int/2addr p2, p1

    .line 101
    iput p2, p0, Ldefpackage/fg4;->d:I

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ldefpackage/ok4;

    .line 22
    .line 23
    iget-object v2, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 26
    .line 27
    iget-object v2, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Ldefpackage/qz0;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ldefpackage/qz0;->d(Landroid/view/View;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iput v0, p0, Ldefpackage/fg4;->c:I

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    const/high16 v0, -0x80000000

    .line 9
    .line 10
    iput v0, p0, Ldefpackage/fg4;->b:I

    .line 11
    .line 12
    iput v0, p0, Ldefpackage/fg4;->c:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Ldefpackage/fg4;->d:I

    .line 16
    .line 17
    return-void
.end method

.method public d()I
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 4
    .line 5
    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    invoke-virtual {p0, v0, v1}, Ldefpackage/fg4;->f(II)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0, v0, v1}, Ldefpackage/fg4;->f(II)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public e()I
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 4
    .line 5
    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p0, v0, v1}, Ldefpackage/fg4;->f(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    const/4 v1, -0x1

    .line 30
    invoke-virtual {p0, v0, v1}, Ldefpackage/fg4;->f(II)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public f(II)I
    .locals 11

    .line 1
    iget-object v0, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Ldefpackage/qz0;

    .line 6
    .line 7
    invoke-virtual {v1}, Ldefpackage/qz0;->m()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Ldefpackage/qz0;

    .line 12
    .line 13
    invoke-virtual {v2}, Ldefpackage/qz0;->i()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, -0x1

    .line 18
    const/4 v4, 0x1

    .line 19
    if-le p2, p1, :cond_0

    .line 20
    .line 21
    move v5, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v5, v3

    .line 24
    :goto_0
    if-eq p1, p2, :cond_5

    .line 25
    .line 26
    iget-object v6, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v6, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    check-cast v6, Landroid/view/View;

    .line 35
    .line 36
    iget-object v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Ldefpackage/qz0;

    .line 37
    .line 38
    invoke-virtual {v7, v6}, Ldefpackage/qz0;->g(Landroid/view/View;)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    iget-object v8, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Ldefpackage/qz0;

    .line 43
    .line 44
    invoke-virtual {v8, v6}, Ldefpackage/qz0;->d(Landroid/view/View;)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    const/4 v9, 0x0

    .line 49
    if-gt v7, v2, :cond_1

    .line 50
    .line 51
    move v10, v4

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v10, v9

    .line 54
    :goto_1
    if-lt v8, v1, :cond_2

    .line 55
    .line 56
    move v9, v4

    .line 57
    :cond_2
    if-eqz v10, :cond_4

    .line 58
    .line 59
    if-eqz v9, :cond_4

    .line 60
    .line 61
    if-lt v7, v1, :cond_3

    .line 62
    .line 63
    if-le v8, v2, :cond_4

    .line 64
    .line 65
    :cond_3
    invoke-static {v6}, Ldefpackage/mw3;->I(Landroid/view/View;)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    return p0

    .line 70
    :cond_4
    add-int/2addr p1, v5

    .line 71
    goto :goto_0

    .line 72
    :cond_5
    return v3
.end method

.method public g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/tv1;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ldefpackage/si1;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget v1, p0, Ldefpackage/fg4;->d:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    iput v1, p0, Ldefpackage/fg4;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    monitor-exit v0

    .line 30
    return-object p1

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    :try_start_1
    iget p1, p0, Ldefpackage/fg4;->e:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x1

    .line 36
    .line 37
    iput p1, p0, Ldefpackage/fg4;->e:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0

    .line 42
    :goto_0
    monitor-exit v0

    .line 43
    throw p0
.end method

.method public h(I)I
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/fg4;->c:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget-object v0, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return p1

    .line 19
    :cond_1
    invoke-virtual {p0}, Ldefpackage/fg4;->b()V

    .line 20
    .line 21
    .line 22
    iget p0, p0, Ldefpackage/fg4;->c:I

    .line 23
    .line 24
    return p0
.end method

.method public i(II)Landroid/view/View;
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, -0x1

    .line 11
    if-ne p2, v2, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, p2, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroid/view/View;

    .line 25
    .line 26
    iget-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-static {v3}, Ldefpackage/mw3;->I(Landroid/view/View;)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-le v4, p1, :cond_2

    .line 35
    .line 36
    :cond_0
    iget-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    invoke-static {v3}, Ldefpackage/mw3;->I(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-lt v4, p1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v3}, Landroid/view/View;->hasFocusable()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    move-object v1, v3

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    :goto_1
    return-object v1

    .line 58
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    add-int/lit8 p2, p2, -0x1

    .line 63
    .line 64
    :goto_2
    if-ltz p2, :cond_6

    .line 65
    .line 66
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Landroid/view/View;

    .line 71
    .line 72
    iget-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 73
    .line 74
    if-eqz v3, :cond_4

    .line 75
    .line 76
    invoke-static {v2}, Ldefpackage/mw3;->I(Landroid/view/View;)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-ge v3, p1, :cond_6

    .line 81
    .line 82
    :cond_4
    iget-boolean v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->w:Z

    .line 83
    .line 84
    if-nez v3, :cond_5

    .line 85
    .line 86
    invoke-static {v2}, Ldefpackage/mw3;->I(Landroid/view/View;)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-gt v3, p1, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->hasFocusable()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_6

    .line 98
    .line 99
    add-int/lit8 p2, p2, -0x1

    .line 100
    .line 101
    move-object v1, v2

    .line 102
    goto :goto_2

    .line 103
    :cond_6
    :goto_3
    return-object v1
.end method

.method public j()F
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget v1, p0, Ldefpackage/fg4;->b:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v1, Ldefpackage/fg4;->i:Ldefpackage/n7;

    .line 11
    .line 12
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 13
    .line 14
    .line 15
    iput v2, p0, Ldefpackage/fg4;->b:I

    .line 16
    .line 17
    :cond_0
    iget p0, p0, Ldefpackage/fg4;->d:I

    .line 18
    .line 19
    int-to-float p0, p0

    .line 20
    const/high16 v1, 0x3f000000    # 0.5f

    .line 21
    .line 22
    mul-float/2addr v1, p0

    .line 23
    move p0, v2

    .line 24
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ge v2, v3, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ldefpackage/eg4;

    .line 35
    .line 36
    iget v4, v3, Ldefpackage/eg4;->b:I

    .line 37
    .line 38
    add-int/2addr p0, v4

    .line 39
    int-to-float v4, p0

    .line 40
    cmpl-float v4, v4, v1

    .line 41
    .line 42
    if-ltz v4, :cond_1

    .line 43
    .line 44
    iget p0, v3, Ldefpackage/eg4;->c:F

    .line 45
    .line 46
    return p0

    .line 47
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 57
    .line 58
    return p0

    .line 59
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    add-int/lit8 p0, p0, -0x1

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Ldefpackage/eg4;

    .line 70
    .line 71
    iget p0, p0, Ldefpackage/eg4;->c:F

    .line 72
    .line 73
    return p0
.end method

.method public k(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget v1, p0, Ldefpackage/fg4;->b:I

    .line 6
    .line 7
    const/high16 v2, -0x80000000

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    return p1

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ldefpackage/ok4;

    .line 31
    .line 32
    iget-object v1, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 35
    .line 36
    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Ldefpackage/qz0;

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ldefpackage/qz0;->g(Landroid/view/View;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    iput p1, p0, Ldefpackage/fg4;->b:I

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget p0, p0, Ldefpackage/fg4;->b:I

    .line 48
    .line 49
    return p0
.end method

.method public l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ldefpackage/tv1;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget v1, p0, Ldefpackage/fg4;->c:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    iput v1, p0, Ldefpackage/fg4;->c:I

    .line 14
    .line 15
    iget-object v1, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ldefpackage/si1;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-virtual {v1, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    iget p2, p0, Ldefpackage/fg4;->c:I

    .line 33
    .line 34
    add-int/lit8 p2, p2, -0x1

    .line 35
    .line 36
    iput p2, p0, Ldefpackage/fg4;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_0
    :goto_0
    monitor-exit v0

    .line 43
    iget p2, p0, Ldefpackage/fg4;->b:I

    .line 44
    .line 45
    :goto_1
    iget-object v0, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ldefpackage/tv1;

    .line 48
    .line 49
    monitor-enter v0

    .line 50
    :try_start_1
    iget v1, p0, Ldefpackage/fg4;->c:I

    .line 51
    .line 52
    if-ltz v1, :cond_8

    .line 53
    .line 54
    iget-object v1, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ldefpackage/si1;

    .line 57
    .line 58
    iget-object v1, v1, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    iget v1, p0, Ldefpackage/fg4;->c:I

    .line 69
    .line 70
    if-nez v1, :cond_8

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_1
    move-exception p0

    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_1
    :goto_2
    iget v1, p0, Ldefpackage/fg4;->c:I

    .line 77
    .line 78
    if-le v1, p2, :cond_7

    .line 79
    .line 80
    iget-object v1, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Ldefpackage/si1;

    .line 83
    .line 84
    iget-object v1, v1, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_2
    iget-object v1, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Ldefpackage/si1;

    .line 98
    .line 99
    iget-object v1, v1, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    check-cast v1, Ljava/lang/Iterable;

    .line 111
    .line 112
    instance-of v2, v1, Ljava/util/List;

    .line 113
    .line 114
    const/4 v3, 0x0

    .line 115
    if-eqz v2, :cond_4

    .line 116
    .line 117
    check-cast v1, Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_3

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_3
    const/4 v2, 0x0

    .line 127
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    goto :goto_3

    .line 132
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_5

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    :goto_3
    check-cast v3, Ljava/util/Map$Entry;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    .line 149
    if-nez v3, :cond_6

    .line 150
    .line 151
    monitor-exit v0

    .line 152
    return-object p1

    .line 153
    :cond_6
    :try_start_2
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iget-object v3, p0, Ldefpackage/fg4;->f:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v3, Ldefpackage/si1;

    .line 164
    .line 165
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    iget-object v3, v3, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 174
    .line 175
    invoke-virtual {v3, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    iget v1, p0, Ldefpackage/fg4;->c:I

    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    add-int/lit8 v1, v1, -0x1

    .line 184
    .line 185
    iput v1, p0, Ldefpackage/fg4;->c:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 186
    .line 187
    monitor-exit v0

    .line 188
    goto/16 :goto_1

    .line 189
    .line 190
    :cond_7
    :goto_4
    monitor-exit v0

    .line 191
    return-object p1

    .line 192
    :cond_8
    :try_start_3
    const-string p0, "LruCache.sizeOf() is reporting inconsistent results!"

    .line 193
    .line 194
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 195
    .line 196
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 200
    :goto_5
    monitor-exit v0

    .line 201
    throw p0

    .line 202
    :goto_6
    monitor-exit v0

    .line 203
    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/fg4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const-string v0, "LruCache[maxSize="

    .line 12
    .line 13
    iget-object v1, p0, Ldefpackage/fg4;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ldefpackage/tv1;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    iget v2, p0, Ldefpackage/fg4;->d:I

    .line 19
    .line 20
    iget v3, p0, Ldefpackage/fg4;->e:I

    .line 21
    .line 22
    add-int/2addr v3, v2

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    mul-int/lit8 v2, v2, 0x64

    .line 26
    .line 27
    div-int/2addr v2, v3

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget v0, p0, Ldefpackage/fg4;->b:I

    .line 38
    .line 39
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v0, ",hits="

    .line 43
    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v0, p0, Ldefpackage/fg4;->d:I

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ",misses="

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget p0, p0, Ldefpackage/fg4;->e:I

    .line 58
    .line 59
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, ",hitRate="

    .line 63
    .line 64
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p0, "%]"

    .line 71
    .line 72
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    monitor-exit v1

    .line 80
    return-object p0

    .line 81
    :goto_1
    monitor-exit v1

    .line 82
    throw p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
