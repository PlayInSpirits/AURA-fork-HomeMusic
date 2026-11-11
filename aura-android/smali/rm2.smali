.class public final Lrm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lmo2;
.implements Lcq0;
.implements Llm3;
.implements Lretrofit2/Callback;
.implements Lu55;
.implements Lcom/eddyizm/tempus/interfaces/DialogClickCallback;
.implements Lbi0;
.implements Lwo4;
.implements Lav4;
.implements Lde;
.implements Lf4;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Lrm2;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    sparse-switch p1, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object p1, Lwv;->o:Lwv;

    .line 11
    .line 12
    const/16 v1, 0x10

    .line 13
    .line 14
    invoke-static {v0, v1, p1}, Lg12;->a(IILwv;)Lcd4;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lrm2;->o:Ljava/lang/Object;

    .line 19
    .line 20
    return-void

    .line 21
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lqf2;

    .line 25
    .line 26
    invoke-direct {p1}, Lqf2;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lrm2;->o:Ljava/lang/Object;

    .line 30
    .line 31
    return-void

    .line 32
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lcom/eddyizm/tempus/database/AppDatabase;->F()Ljv3;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lrm2;->o:Ljava/lang/Object;

    .line 44
    .line 45
    return-void

    .line 46
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-static {p1}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lrm2;->o:Ljava/lang/Object;

    .line 56
    .line 57
    return-void

    .line 58
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lrm2;->o:Ljava/lang/Object;

    .line 67
    .line 68
    return-void

    .line 69
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 73
    .line 74
    const/16 v1, 0x1c

    .line 75
    .line 76
    if-lt p1, v1, :cond_0

    .line 77
    .line 78
    new-instance p1, Ltv1;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    new-instance p1, Lhh3;

    .line 85
    .line 86
    invoke-direct {p1, v0}, Lhh3;-><init>(I)V

    .line 87
    .line 88
    .line 89
    :goto_0
    iput-object p1, p0, Lrm2;->o:Ljava/lang/Object;

    .line 90
    .line 91
    return-void

    .line 92
    nop

    .line 93
    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_4
        0xe -> :sswitch_3
        0xf -> :sswitch_2
        0x10 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 121
    iput p1, p0, Lrm2;->n:I

    iput-object p2, p0, Lrm2;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 93
    iput p1, p0, Lrm2;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/app/Notification;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lrm2;->n:I

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    iput-object p1, p0, Lrm2;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lce;F)V
    .locals 5

    const/16 v0, 0x1b

    iput v0, p0, Lrm2;->n:I

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    invoke-virtual {p1}, Lce;->b()I

    move-result v0

    new-array v1, v0, [Ld81;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 131
    new-instance v3, Ld81;

    invoke-virtual {p1, v2}, Lce;->a(I)F

    move-result v4

    invoke-direct {v3, p2, v4}, Ld81;-><init>(FF)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 132
    :cond_0
    iput-object v1, p0, Lrm2;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Loo0;)V
    .locals 2

    const/16 v0, 0x14

    iput v0, p0, Lrm2;->n:I

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    new-instance v0, Lyx0;

    .line 96
    sget v1, Lxj4;->a:F

    .line 97
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v1, v0, Lyx0;->a:F

    .line 98
    invoke-interface {p1}, Loo0;->g()F

    move-result p1

    sget v1, La81;->a:F

    const v1, 0x43c10b3d

    mul-float/2addr p1, v1

    const/high16 v1, 0x43200000    # 160.0f

    mul-float/2addr p1, v1

    const v1, 0x3f570a3d    # 0.84f

    mul-float/2addr p1, v1

    .line 99
    iput p1, v0, Lyx0;->b:F

    .line 100
    iput-object v0, p0, Lrm2;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lye5;)V
    .locals 9

    const/16 v0, 0x18

    iput v0, p0, Lrm2;->n:I

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 127
    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    .line 128
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v8, p1

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Lrm2;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([J)V
    .locals 5

    const/16 v0, 0x12

    iput v0, p0, Lrm2;->n:I

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_4

    .line 102
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    .line 103
    new-instance v0, Ll03;

    array-length v1, p1

    invoke-direct {v0, v1}, Ll03;-><init>(I)V

    .line 104
    iget v1, v0, Ll03;->b:I

    if-ltz v1, :cond_3

    .line 105
    array-length v2, p1

    if-nez v2, :cond_0

    goto :goto_0

    .line 106
    :cond_0
    array-length v2, p1

    add-int/2addr v2, v1

    .line 107
    iget-object v3, v0, Ll03;->a:[J

    .line 108
    array-length v4, v3

    if-ge v4, v2, :cond_1

    .line 109
    array-length v4, v3

    mul-int/lit8 v4, v4, 0x3

    div-int/lit8 v4, v4, 0x2

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 110
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    iput-object v2, v0, Ll03;->a:[J

    .line 111
    :cond_1
    iget-object v2, v0, Ll03;->a:[J

    .line 112
    iget v3, v0, Ll03;->b:I

    if-eq v1, v3, :cond_2

    .line 113
    array-length v4, p1

    add-int/2addr v4, v1

    .line 114
    invoke-static {v2, v2, v4, v1, v3}, Lti;->a0([J[JIII)V

    .line 115
    :cond_2
    array-length v3, p1

    const/4 v4, 0x0

    invoke-static {p1, v2, v1, v4, v3}, Lti;->a0([J[JIII)V

    .line 116
    iget v1, v0, Ll03;->b:I

    array-length p1, p1

    add-int/2addr v1, p1

    iput v1, v0, Ll03;->b:I

    goto :goto_0

    .line 117
    :cond_3
    const-string p0, ""

    .line 118
    invoke-static {p0}, Lkf2;->h(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 119
    :cond_4
    new-instance v0, Ll03;

    invoke-direct {v0}, Ll03;-><init>()V

    .line 120
    :goto_0
    iput-object v0, p0, Lrm2;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lnw3;

    .line 6
    .line 7
    invoke-static {p1}, Lmw3;->C(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 12
    .line 13
    sub-int/2addr p1, p0

    .line 14
    return p1
.end method

.method public b(Lno2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldw2;

    .line 4
    .line 5
    iget-object v0, v0, Ldw2;->d:Lew2;

    .line 6
    .line 7
    iget-object v0, v0, Lew2;->s:Lfw2;

    .line 8
    .line 9
    iget-object v0, v0, Lfw2;->d:Lbw2;

    .line 10
    .line 11
    invoke-interface {p1}, Lno2;->n()Ltv4;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, p0, Lrm2;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ldw2;

    .line 18
    .line 19
    iget-object v1, v1, Ldw2;->d:Lew2;

    .line 20
    .line 21
    iget-object v1, v1, Lew2;->q:Lcu4;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, Lbw2;->a:Lhw2;

    .line 27
    .line 28
    iget-object v1, v0, Lhw2;->p:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter v1

    .line 31
    :try_start_0
    iget-object v0, v0, Lhw2;->r:Llb4;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v2, Lcw2;

    .line 37
    .line 38
    invoke-direct {v2, p1}, Lcw2;-><init>(Ltv4;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lu0;->l(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Ldw2;

    .line 48
    .line 49
    iget-object p0, p0, Ldw2;->d:Lew2;

    .line 50
    .line 51
    iget-object p0, p0, Lew2;->s:Lfw2;

    .line 52
    .line 53
    invoke-virtual {p0}, Lfw2;->a()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw p0
.end method

.method public c(J)J
    .locals 2

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lqf2;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lk45;->b(J)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    invoke-static {p1, p2}, Lk45;->c(J)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    cmpl-float v0, v0, v1

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1, p2}, Lk45;->f(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "maximumVelocity should be a positive value. You specified="

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v0, p0, Lqf2;->a:Lm45;

    .line 40
    .line 41
    invoke-static {p1, p2}, Lk45;->b(J)F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v0, v1}, Lm45;->b(F)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object p0, p0, Lqf2;->b:Lm45;

    .line 50
    .line 51
    invoke-static {p1, p2}, Lk45;->c(J)F

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {p0, p1}, Lm45;->b(F)F

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    invoke-static {v0, p0}, Le35;->h(FF)J

    .line 60
    .line 61
    .line 62
    move-result-wide p0

    .line 63
    return-wide p0
.end method

.method public d()I
    .locals 0

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmw3;

    .line 4
    .line 5
    invoke-virtual {p0}, Lmw3;->H()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public e(Lq02;Lvd0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcd4;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcd4;->b(Ljava/lang/Object;Lvd0;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object p1, Lxe0;->n:Lxe0;

    .line 10
    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lj15;->a:Lj15;

    .line 15
    .line 16
    return-object p0
.end method

.method public f()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxo4;

    .line 4
    .line 5
    iget-object p0, p0, Lzo4;->o:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lwl3;

    .line 4
    .line 5
    iget-object p0, p0, Lwl3;->h:Lk03;

    .line 6
    .line 7
    const v0, 0x7f1303f6

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Lad2;->i(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public get(I)Lc81;
    .locals 0

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [Ld81;

    .line 4
    .line 5
    aget-object p0, p0, p1

    .line 6
    .line 7
    return-object p0
.end method

.method public h(Landroid/view/View;)Z
    .locals 2

    .line 1
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 2
    .line 3
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lss0;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x1

    .line 12
    add-int/2addr p1, v0

    .line 13
    iget-object p0, p0, Lss0;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 16
    .line 17
    iget-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->d(IZ)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return v0
.end method

.method public i(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->r(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public j(Lda4;)V
    .locals 0

    .line 1
    check-cast p1, Lno2;

    .line 2
    .line 3
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldw2;

    .line 6
    .line 7
    iget-object p0, p0, Ldw2;->d:Lew2;

    .line 8
    .line 9
    iget-object p0, p0, Lew2;->s:Lfw2;

    .line 10
    .line 11
    iget-object p0, p0, Lfw2;->c:Lyp4;

    .line 12
    .line 13
    const/4 p1, 0x3

    .line 14
    invoke-virtual {p0, p1}, Lyp4;->a(I)Lxp4;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Lxp4;->b()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public k()I
    .locals 1

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmw3;

    .line 4
    .line 5
    iget v0, p0, Lmw3;->o:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lmw3;->E()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    sub-int/2addr v0, p0

    .line 12
    return v0
.end method

.method public l(Lq02;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcd4;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcd4;->q(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public m()Lci0;
    .locals 1

    .line 1
    new-instance v0, Ljm4;

    .line 2
    .line 3
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lkx;

    .line 6
    .line 7
    invoke-virtual {p0}, Lkx;->a()Llx;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljm4;-><init>(Llx;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public n(Lvo4;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxo4;

    .line 4
    .line 5
    iget-object v0, p0, Lxo4;->q:[I

    .line 6
    .line 7
    array-length v0, v0

    .line 8
    const/4 v1, 0x1

    .line 9
    move v2, v1

    .line 10
    :goto_0
    if-ge v2, v0, :cond_5

    .line 11
    .line 12
    iget-object v3, p0, Lxo4;->q:[I

    .line 13
    .line 14
    aget v3, v3, v2

    .line 15
    .line 16
    if-eq v3, v1, :cond_4

    .line 17
    .line 18
    const/4 v4, 0x2

    .line 19
    if-eq v3, v4, :cond_3

    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    if-eq v3, v4, :cond_2

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    if-eq v3, v4, :cond_1

    .line 26
    .line 27
    const/4 v4, 0x5

    .line 28
    if-eq v3, v4, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-interface {p1, v2}, Lvo4;->e(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v3, p0, Lxo4;->u:[[B

    .line 36
    .line 37
    aget-object v3, v3, v2

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v2, v3}, Lvo4;->x(I[B)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    iget-object v3, p0, Lxo4;->t:[Ljava/lang/String;

    .line 47
    .line 48
    aget-object v3, v3, v2

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v2, v3}, Lvo4;->h(ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    iget-object v3, p0, Lxo4;->s:[D

    .line 58
    .line 59
    aget-wide v4, v3, v2

    .line 60
    .line 61
    invoke-interface {p1, v4, v5, v2}, Lvo4;->d(DI)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    iget-object v3, p0, Lxo4;->r:[J

    .line 66
    .line 67
    aget-wide v4, v3, v2

    .line 68
    .line 69
    invoke-interface {p1, v2, v4, v5}, Lvo4;->c(IJ)V

    .line 70
    .line 71
    .line 72
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    return-void
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget p1, p0, Lrm2;->n:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/Exception;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    instance-of p2, p2, Ljava/io/IOException;

    .line 16
    .line 17
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lcom/eddyizm/tempus/interfaces/SystemCallback;

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/SystemCallback;->onNetworkFailure(Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/SystemCallback;->onError(Ljava/lang/Exception;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :sswitch_0
    const-string p0, "SongRepository"

    .line 32
    .line 33
    const-string p1, "fetchSingleTrackThenSimilar.onFailure()"

    .line 34
    .line 35
    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :sswitch_1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lgu3;

    .line 42
    .line 43
    iget-object p0, p0, Lgu3;->g:Lk03;

    .line 44
    .line 45
    new-instance p1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v0, "Network error: "

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :sswitch_2
    const-string p1, "QueueRepository"

    .line 68
    .line 69
    const-string v0, "syncBookmarks failed"

    .line 70
    .line 71
    invoke-static {p1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Lzo1;

    .line 77
    .line 78
    new-instance p1, Landroid/os/Handler;

    .line 79
    .line 80
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :sswitch_3
    const-string p0, "PodcastEpisodeBottomSheetViewModel"

    .line 92
    .line 93
    const-string p1, "deletePodcastEpisode network error"

    .line 94
    .line 95
    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_3
        0xa -> :sswitch_2
        0xb -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcv4;

    .line 4
    .line 5
    iget-object p0, p0, Lcv4;->e:Landroid/view/Window$Callback;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-interface {p0, v0, p1}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public onNegativeClick()V
    .locals 2

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lvb4;

    .line 4
    .line 5
    const-string v0, "download_storage"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f1300f2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->w(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lvb4;->m0()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onNeutralClick()V
    .locals 2

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lvb4;

    .line 4
    .line 5
    const-string v0, "download_storage"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f1300f0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->w(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lvb4;->m0()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onPositiveClick()V
    .locals 2

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lvb4;

    .line 4
    .line 5
    const-string v0, "download_storage"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f1300f1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->w(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lvb4;->m0()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lrm2;->n:I

    .line 4
    .line 5
    const-string v2, "ok"

    .line 6
    .line 7
    sparse-switch v1, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lrm2;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/eddyizm/tempus/interfaces/SystemCallback;

    .line 13
    .line 14
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lcom/eddyizm/tempus/subsonic/models/ResponseStatus;->FAILED:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getError()Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Ljava/lang/Exception;

    .line 57
    .line 58
    if-eqz v1, :cond_0

    .line 59
    .line 60
    new-instance v3, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Error;->getCode()Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v4, " - "

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Error;->getMessage()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const-string v1, "Unknown server error"

    .line 90
    .line 91
    :goto_0
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v2}, Lcom/eddyizm/tempus/interfaces/SystemCallback;->onError(Ljava/lang/Exception;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    sget-object v2, Lcom/eddyizm/tempus/subsonic/models/ResponseStatus;->OK:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->raw()Lk14;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iget-object v1, v1, Lk14;->n:Loz3;

    .line 125
    .line 126
    iget-object v1, v1, Loz3;->a:Lgr1;

    .line 127
    .line 128
    const-string v2, "p"

    .line 129
    .line 130
    invoke-virtual {v1, v2}, Lgr1;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->raw()Lk14;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    iget-object v2, v2, Lk14;->n:Loz3;

    .line 139
    .line 140
    iget-object v2, v2, Loz3;->a:Lgr1;

    .line 141
    .line 142
    const-string v3, "t"

    .line 143
    .line 144
    invoke-virtual {v2, v3}, Lgr1;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->raw()Lk14;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    iget-object v3, v3, Lk14;->n:Loz3;

    .line 153
    .line 154
    iget-object v3, v3, Loz3;->a:Lgr1;

    .line 155
    .line 156
    const-string v4, "s"

    .line 157
    .line 158
    invoke-virtual {v3, v4}, Lgr1;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-interface {v0, v1, v2, v3}, Lcom/eddyizm/tempus/interfaces/SystemCallback;->onSuccess(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_2
    new-instance v1, Ljava/lang/Exception;

    .line 167
    .line 168
    const-string v2, "Empty response"

    .line 169
    .line 170
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v0, v1}, Lcom/eddyizm/tempus/interfaces/SystemCallback;->onError(Ljava/lang/Exception;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    new-instance v1, Ljava/lang/Exception;

    .line 178
    .line 179
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->code()I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v0, v1}, Lcom/eddyizm/tempus/interfaces/SystemCallback;->onError(Ljava/lang/Exception;)V

    .line 191
    .line 192
    .line 193
    :goto_1
    return-void

    .line 194
    :sswitch_0
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_4

    .line 199
    .line 200
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-eqz v1, :cond_4

    .line 205
    .line 206
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 211
    .line 212
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSong()Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    if-eqz v1, :cond_4

    .line 221
    .line 222
    iget-object v0, v0, Lrm2;->o:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v0, Lwi4;

    .line 225
    .line 226
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v0, v1}, Lwi4;->a(Ljava/util/List;)V

    .line 231
    .line 232
    .line 233
    :cond_4
    return-void

    .line 234
    :sswitch_1
    iget-object v0, v0, Lrm2;->o:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, Lgu3;

    .line 237
    .line 238
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_6

    .line 243
    .line 244
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    if-eqz v1, :cond_6

    .line 249
    .line 250
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 255
    .line 256
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    if-eqz v3, :cond_7

    .line 261
    .line 262
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_5

    .line 275
    .line 276
    iget-object v0, v0, Lgu3;->f:Lk03;

    .line 277
    .line 278
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-virtual {v0, v1}, Lad2;->k(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_5
    const-string v2, "failed"

    .line 285
    .line 286
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    if-eqz v2, :cond_7

    .line 291
    .line 292
    invoke-static {v0, v1}, Lgu3;->c(Lgu3;Lcom/eddyizm/tempus/subsonic/base/ApiResponse;)V

    .line 293
    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_6
    iget-object v0, v0, Lgu3;->g:Lk03;

    .line 297
    .line 298
    new-instance v1, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-string v2, "HTTP error: "

    .line 301
    .line 302
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->code()I

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {v0, v1}, Lad2;->k(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    :cond_7
    :goto_2
    return-void

    .line 320
    :sswitch_2
    iget-object v0, v0, Lrm2;->o:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v0, Lzo1;

    .line 323
    .line 324
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_11

    .line 329
    .line 330
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    if-eqz v1, :cond_11

    .line 335
    .line 336
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 341
    .line 342
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    if-eqz v1, :cond_11

    .line 347
    .line 348
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 353
    .line 354
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getBookmarks()Lcom/eddyizm/tempus/subsonic/models/Bookmarks;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    if-eqz v1, :cond_8

    .line 363
    .line 364
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 369
    .line 370
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getBookmarks()Lcom/eddyizm/tempus/subsonic/models/Bookmarks;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Bookmarks;->getBookmarks()Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    goto :goto_3

    .line 383
    :cond_8
    const/4 v1, 0x0

    .line 384
    :goto_3
    if-eqz v1, :cond_11

    .line 385
    .line 386
    new-instance v2, Ljava/util/HashMap;

    .line 387
    .line 388
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 389
    .line 390
    .line 391
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-eqz v3, :cond_c

    .line 400
    .line 401
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Bookmark;

    .line 406
    .line 407
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->getEntry()Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    if-eqz v4, :cond_9

    .line 412
    .line 413
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    if-eqz v5, :cond_9

    .line 418
    .line 419
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->getPosition()J

    .line 420
    .line 421
    .line 422
    move-result-wide v5

    .line 423
    const-wide/16 v7, 0x0

    .line 424
    .line 425
    cmp-long v5, v5, v7

    .line 426
    .line 427
    if-gtz v5, :cond_a

    .line 428
    .line 429
    goto :goto_4

    .line 430
    :cond_a
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->getChanged()Ljava/util/Date;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    if-eqz v5, :cond_b

    .line 435
    .line 436
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->getChanged()Ljava/util/Date;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 441
    .line 442
    .line 443
    move-result-wide v5

    .line 444
    :goto_5
    move-wide/from16 v17, v5

    .line 445
    .line 446
    goto :goto_6

    .line 447
    :cond_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 448
    .line 449
    .line 450
    move-result-wide v5

    .line 451
    goto :goto_5

    .line 452
    :goto_6
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    new-instance v7, Lsp3;

    .line 457
    .line 458
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Bookmark;->getPosition()J

    .line 463
    .line 464
    .line 465
    move-result-wide v9

    .line 466
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v11

    .line 470
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v12

    .line 474
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v13

    .line 478
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v14

    .line 482
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v15

    .line 486
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v16

    .line 490
    invoke-direct/range {v7 .. v18}, Lsp3;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    goto :goto_4

    .line 497
    :cond_c
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-eqz v1, :cond_d

    .line 502
    .line 503
    goto :goto_8

    .line 504
    :cond_d
    invoke-static {}, Lud3;->A()Ljava/util/Map;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    :cond_e
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 517
    .line 518
    .line 519
    move-result v3

    .line 520
    if-eqz v3, :cond_10

    .line 521
    .line 522
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    check-cast v3, Ljava/util/Map$Entry;

    .line 527
    .line 528
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    check-cast v4, Ljava/lang/String;

    .line 533
    .line 534
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    check-cast v3, Lsp3;

    .line 539
    .line 540
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    check-cast v5, Lsp3;

    .line 545
    .line 546
    if-eqz v5, :cond_f

    .line 547
    .line 548
    iget-wide v6, v3, Lsp3;->i:J

    .line 549
    .line 550
    iget-wide v8, v5, Lsp3;->i:J

    .line 551
    .line 552
    cmp-long v5, v6, v8

    .line 553
    .line 554
    if-ltz v5, :cond_e

    .line 555
    .line 556
    :cond_f
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    goto :goto_7

    .line 560
    :cond_10
    invoke-static {v1}, Lud3;->N0(Ljava/util/Map;)V

    .line 561
    .line 562
    .line 563
    :cond_11
    :goto_8
    new-instance v1, Landroid/os/Handler;

    .line 564
    .line 565
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 573
    .line 574
    .line 575
    return-void

    .line 576
    :sswitch_3
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    if-eqz v1, :cond_12

    .line 581
    .line 582
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    if-eqz v1, :cond_12

    .line 587
    .line 588
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 593
    .line 594
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    if-eqz v1, :cond_12

    .line 599
    .line 600
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    check-cast v1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 605
    .line 606
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    if-eqz v1, :cond_12

    .line 619
    .line 620
    iget-object v0, v0, Lrm2;->o:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v0, Lgn3;

    .line 623
    .line 624
    iget-object v0, v0, Lhd;->b:Landroid/app/Application;

    .line 625
    .line 626
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    const-string v1, "Podcast episode deleted"

    .line 630
    .line 631
    const/4 v2, 0x0

    .line 632
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 637
    .line 638
    .line 639
    goto :goto_9

    .line 640
    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 641
    .line 642
    const-string v1, "deletePodcastEpisode failed with code: "

    .line 643
    .line 644
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    invoke-virtual/range {p2 .. p2}, Lretrofit2/Response;->code()I

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    const-string v1, "PodcastEpisodeBottomSheetViewModel"

    .line 659
    .line 660
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 661
    .line 662
    .line 663
    :goto_9
    return-void

    .line 664
    nop

    .line 665
    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_3
        0xa -> :sswitch_2
        0xb -> :sswitch_1
        0x13 -> :sswitch_0
    .end sparse-switch
.end method

.method public onSuccess()V
    .locals 1

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lwl3;

    .line 4
    .line 5
    iget-object p0, p0, Lwl3;->h:Lk03;

    .line 6
    .line 7
    const v0, 0x7f1303f7

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Lad2;->i(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public p(F)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lrm2;->t()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroidx/core/widget/NestedScrollView;

    .line 14
    .line 15
    float-to-int p1, p1

    .line 16
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->j(I)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public q(I)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lmw3;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lmw3;->u(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public r(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lnw3;

    .line 6
    .line 7
    invoke-static {p1}, Lmw3;->y(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 12
    .line 13
    add-int/2addr p1, p0

    .line 14
    return p1
.end method

.method public s()F
    .locals 0

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getVerticalScrollFactorCompat()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    neg-float p0, p0

    .line 10
    return p0
.end method

.method public t()V
    .locals 0

    .line 1
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/core/widget/NestedScrollView;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->q:Landroid/widget/OverScroller;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
