.class public final Ldefpackage/ip4;
.super Ldefpackage/cx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/sn3;
.implements Ldefpackage/oo0;
.implements Ldefpackage/rn3;


# instance fields
.field public B:Ljava/lang/Object;

.field public C:Ljava/lang/Object;

.field public D:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

.field public E:Ldefpackage/sk4;

.field public F:Ldefpackage/kn3;

.field public final G:Ldefpackage/f13;

.field public final H:Ldefpackage/f13;

.field public final I:Ldefpackage/f13;

.field public J:Ldefpackage/kn3;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/cx2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ip4;->B:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/ip4;->C:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/ip4;->D:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 9
    .line 10
    sget-object p1, Ldefpackage/gp4;->a:Ldefpackage/kn3;

    .line 11
    .line 12
    iput-object p1, p0, Ldefpackage/ip4;->F:Ldefpackage/kn3;

    .line 13
    .line 14
    new-instance p1, Ldefpackage/f13;

    .line 15
    .line 16
    const/16 p2, 0x10

    .line 17
    .line 18
    new-array p3, p2, [Ldefpackage/hp4;

    .line 19
    .line 20
    invoke-direct {p1, p3}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ldefpackage/ip4;->G:Ldefpackage/f13;

    .line 24
    .line 25
    iput-object p1, p0, Ldefpackage/ip4;->H:Ldefpackage/f13;

    .line 26
    .line 27
    new-instance p1, Ldefpackage/f13;

    .line 28
    .line 29
    new-array p2, p2, [Ldefpackage/hp4;

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Ldefpackage/ip4;->I:Ldefpackage/f13;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final J()F
    .locals 0

    .line 1
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 6
    .line 7
    invoke-interface {p0}, Ldefpackage/oo0;->J()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final Z()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ip4;->r0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ip4;->r0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g()F
    .locals 0

    .line 1
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Ldefpackage/c72;->J:Ldefpackage/oo0;

    .line 6
    .line 7
    invoke-interface {p0}, Ldefpackage/oo0;->g()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final j0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/ip4;->r0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final n(Ldefpackage/kn3;Ldefpackage/ln3;J)V
    .locals 3

    .line 1
    sget-object p3, Ldefpackage/ln3;->n:Ldefpackage/ln3;

    .line 2
    .line 3
    if-ne p2, p3, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Ldefpackage/ip4;->F:Ldefpackage/kn3;

    .line 6
    .line 7
    :cond_0
    iget-object p3, p0, Ldefpackage/ip4;->E:Ldefpackage/sk4;

    .line 8
    .line 9
    const/4 p4, 0x0

    .line 10
    if-nez p3, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/cx2;->e0()Ldefpackage/we0;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    new-instance v0, Ldefpackage/ac0;

    .line 17
    .line 18
    const/4 v1, 0x7

    .line 19
    invoke-direct {v0, p0, p4, v1}, Ldefpackage/ac0;-><init>(Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 20
    .line 21
    .line 22
    sget-object v1, Ldefpackage/ze0;->q:Ldefpackage/ze0;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-static {p3, p4, v1, v0, v2}, Ldefpackage/fu;->G(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;I)Ldefpackage/sk4;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    iput-object p3, p0, Ldefpackage/ip4;->E:Ldefpackage/sk4;

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0, p1, p2}, Ldefpackage/ip4;->q0(Ldefpackage/kn3;Ldefpackage/ln3;)V

    .line 32
    .line 33
    .line 34
    iget-object p2, p1, Ldefpackage/kn3;->a:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    const/4 v0, 0x0

    .line 41
    :goto_0
    if-ge v0, p3, :cond_3

    .line 42
    .line 43
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ldefpackage/on3;

    .line 48
    .line 49
    invoke-static {v1}, Ldefpackage/gi1;->i(Ldefpackage/on3;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    move-object p1, p4

    .line 60
    :goto_1
    iput-object p1, p0, Ldefpackage/ip4;->J:Ldefpackage/kn3;

    .line 61
    .line 62
    return-void
.end method

.method public final q0(Ldefpackage/kn3;Ldefpackage/ln3;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/ip4;->H:Ldefpackage/f13;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ldefpackage/ip4;->I:Ldefpackage/f13;

    .line 5
    .line 6
    iget-object v2, p0, Ldefpackage/ip4;->G:Ldefpackage/f13;

    .line 7
    .line 8
    iget v3, v1, Ldefpackage/f13;->p:I

    .line 9
    .line 10
    invoke-virtual {v1, v3, v2}, Ldefpackage/f13;->c(ILdefpackage/f13;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 29
    .line 30
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    iget-object v0, p0, Ldefpackage/ip4;->I:Ldefpackage/f13;

    .line 37
    .line 38
    iget v3, v0, Ldefpackage/f13;->p:I

    .line 39
    .line 40
    sub-int/2addr v3, v2

    .line 41
    iget-object v0, v0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 42
    .line 43
    array-length v2, v0

    .line 44
    if-ge v3, v2, :cond_5

    .line 45
    .line 46
    :goto_0
    if-ltz v3, :cond_5

    .line 47
    .line 48
    aget-object v2, v0, v3

    .line 49
    .line 50
    check-cast v2, Ldefpackage/hp4;

    .line 51
    .line 52
    iget-object v4, v2, Ldefpackage/hp4;->q:Ldefpackage/ln3;

    .line 53
    .line 54
    if-ne p2, v4, :cond_2

    .line 55
    .line 56
    iget-object v4, v2, Ldefpackage/hp4;->p:Ldefpackage/cz;

    .line 57
    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    iput-object v1, v2, Ldefpackage/hp4;->p:Ldefpackage/cz;

    .line 61
    .line 62
    invoke-virtual {v4, p1}, Ldefpackage/cz;->resumeWith(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    iget-object v0, p0, Ldefpackage/ip4;->I:Ldefpackage/f13;

    .line 69
    .line 70
    iget-object v2, v0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 71
    .line 72
    iget v0, v0, Ldefpackage/f13;->p:I

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    :goto_2
    if-ge v3, v0, :cond_5

    .line 76
    .line 77
    aget-object v4, v2, v3

    .line 78
    .line 79
    check-cast v4, Ldefpackage/hp4;

    .line 80
    .line 81
    iget-object v5, v4, Ldefpackage/hp4;->q:Ldefpackage/ln3;

    .line 82
    .line 83
    if-ne p2, v5, :cond_4

    .line 84
    .line 85
    iget-object v5, v4, Ldefpackage/hp4;->p:Ldefpackage/cz;

    .line 86
    .line 87
    if-eqz v5, :cond_4

    .line 88
    .line 89
    iput-object v1, v4, Ldefpackage/hp4;->p:Ldefpackage/cz;

    .line 90
    .line 91
    invoke-virtual {v5, p1}, Ldefpackage/cz;->resumeWith(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    .line 94
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    iget-object p0, p0, Ldefpackage/ip4;->I:Ldefpackage/f13;

    .line 98
    .line 99
    invoke-virtual {p0}, Ldefpackage/f13;->g()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :goto_3
    iget-object p0, p0, Ldefpackage/ip4;->I:Ldefpackage/f13;

    .line 104
    .line 105
    invoke-virtual {p0}, Ldefpackage/f13;->g()V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :catchall_1
    move-exception p0

    .line 110
    monitor-exit v0

    .line 111
    throw p0
.end method

.method public final r0()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/ip4;->E:Ldefpackage/sk4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Landroidx/compose/ui/input/pointer/PointerInputResetException;

    .line 6
    .line 7
    invoke-direct {v1}, Landroidx/compose/ui/input/pointer/PointerInputResetException;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ldefpackage/a32;->p(Ljava/util/concurrent/CancellationException;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Ldefpackage/ip4;->E:Ldefpackage/sk4;

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final t()V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ip4;->J:Ldefpackage/kn3;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v1, v1, Ldefpackage/kn3;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v2, :cond_3

    .line 17
    .line 18
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Ldefpackage/on3;

    .line 23
    .line 24
    iget-boolean v5, v5, Ldefpackage/on3;->d:Z

    .line 25
    .line 26
    if-eqz v5, :cond_2

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    :goto_1
    if-ge v3, v4, :cond_1

    .line 42
    .line 43
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Ldefpackage/on3;

    .line 48
    .line 49
    iget-wide v7, v5, Ldefpackage/on3;->a:J

    .line 50
    .line 51
    iget-wide v11, v5, Ldefpackage/on3;->c:J

    .line 52
    .line 53
    iget-wide v9, v5, Ldefpackage/on3;->b:J

    .line 54
    .line 55
    iget v14, v5, Ldefpackage/on3;->e:F

    .line 56
    .line 57
    iget-boolean v6, v5, Ldefpackage/on3;->d:Z

    .line 58
    .line 59
    iget v5, v5, Ldefpackage/on3;->i:I

    .line 60
    .line 61
    move/from16 v19, v6

    .line 62
    .line 63
    new-instance v6, Ldefpackage/on3;

    .line 64
    .line 65
    const/high16 v24, 0x3f800000    # 1.0f

    .line 66
    .line 67
    const-wide/16 v25, 0x0

    .line 68
    .line 69
    const/4 v13, 0x0

    .line 70
    const-wide/16 v22, 0x0

    .line 71
    .line 72
    move-wide v15, v9

    .line 73
    move-wide/from16 v17, v11

    .line 74
    .line 75
    move/from16 v20, v19

    .line 76
    .line 77
    move/from16 v21, v5

    .line 78
    .line 79
    invoke-direct/range {v6 .. v26}, Ldefpackage/on3;-><init>(JJJZFJJZZIJFJ)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    new-instance v1, Ldefpackage/kn3;

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    invoke-direct {v1, v2, v3}, Ldefpackage/kn3;-><init>(Ljava/util/List;Ldefpackage/gp3;)V

    .line 92
    .line 93
    .line 94
    iput-object v1, v0, Ldefpackage/ip4;->F:Ldefpackage/kn3;

    .line 95
    .line 96
    sget-object v2, Ldefpackage/ln3;->n:Ldefpackage/ln3;

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Ldefpackage/ip4;->q0(Ldefpackage/kn3;Ldefpackage/ln3;)V

    .line 99
    .line 100
    .line 101
    sget-object v2, Ldefpackage/ln3;->o:Ldefpackage/ln3;

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Ldefpackage/ip4;->q0(Ldefpackage/kn3;Ldefpackage/ln3;)V

    .line 104
    .line 105
    .line 106
    sget-object v2, Ldefpackage/ln3;->p:Ldefpackage/ln3;

    .line 107
    .line 108
    invoke-virtual {v0, v1, v2}, Ldefpackage/ip4;->q0(Ldefpackage/kn3;Ldefpackage/ln3;)V

    .line 109
    .line 110
    .line 111
    iput-object v3, v0, Ldefpackage/ip4;->J:Ldefpackage/kn3;

    .line 112
    .line 113
    return-void

    .line 114
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    :goto_2
    return-void
.end method
