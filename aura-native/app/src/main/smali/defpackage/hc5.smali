.class public final Ldefpackage/hc5;
.super Ldefpackage/ep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/wf1;


# instance fields
.field public o:Ldefpackage/xv;

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Landroid/content/ContentResolver;

.field public final synthetic s:Landroid/net/Uri;

.field public final synthetic t:Ldefpackage/ng0;

.field public final synthetic u:Ldefpackage/aw;

.field public final synthetic v:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;Ldefpackage/ng0;Ldefpackage/aw;Landroid/content/Context;Ldefpackage/vd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/hc5;->r:Landroid/content/ContentResolver;

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/hc5;->s:Landroid/net/Uri;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/hc5;->t:Ldefpackage/ng0;

    .line 6
    .line 7
    iput-object p4, p0, Ldefpackage/hc5;->u:Ldefpackage/aw;

    .line 8
    .line 9
    iput-object p5, p0, Ldefpackage/hc5;->v:Landroid/content/Context;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ldefpackage/ep4;-><init>(ILdefpackage/vd0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;
    .locals 7

    .line 1
    new-instance v0, Ldefpackage/hc5;

    .line 2
    .line 3
    iget-object v4, p0, Ldefpackage/hc5;->u:Ldefpackage/aw;

    .line 4
    .line 5
    iget-object v5, p0, Ldefpackage/hc5;->v:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/hc5;->r:Landroid/content/ContentResolver;

    .line 8
    .line 9
    iget-object v2, p0, Ldefpackage/hc5;->s:Landroid/net/Uri;

    .line 10
    .line 11
    iget-object v3, p0, Ldefpackage/hc5;->t:Ldefpackage/ng0;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Ldefpackage/hc5;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Ldefpackage/ng0;Ldefpackage/aw;Landroid/content/Context;Ldefpackage/vd0;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Ldefpackage/hc5;->q:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ldefpackage/q81;

    .line 2
    .line 3
    check-cast p2, Ldefpackage/vd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ldefpackage/hc5;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ldefpackage/hc5;

    .line 10
    .line 11
    sget-object p1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ldefpackage/hc5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/hc5;->p:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Ldefpackage/hc5;->t:Ldefpackage/ng0;

    .line 6
    .line 7
    iget-object v4, p0, Ldefpackage/hc5;->r:Landroid/content/ContentResolver;

    .line 8
    .line 9
    sget-object v5, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    if-eq v0, v2, :cond_2

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/hc5;->o:Ldefpackage/xv;

    .line 18
    .line 19
    iget-object v6, p0, Ldefpackage/hc5;->q:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v6, Ldefpackage/q81;

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    :cond_0
    move-object p1, v6

    .line 27
    move-object v6, v0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_3

    .line 31
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :cond_2
    iget-object v0, p0, Ldefpackage/hc5;->o:Ldefpackage/xv;

    .line 39
    .line 40
    iget-object v6, p0, Ldefpackage/hc5;->q:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v6, Ldefpackage/q81;

    .line 43
    .line 44
    :try_start_1
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Ldefpackage/hc5;->q:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Ldefpackage/q81;

    .line 54
    .line 55
    iget-object v0, p0, Ldefpackage/hc5;->s:Landroid/net/Uri;

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-virtual {v4, v0, v6, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 59
    .line 60
    .line 61
    :try_start_2
    iget-object v0, p0, Ldefpackage/hc5;->u:Ldefpackage/aw;

    .line 62
    .line 63
    new-instance v6, Ldefpackage/xv;

    .line 64
    .line 65
    invoke-direct {v6, v0}, Ldefpackage/xv;-><init>(Ldefpackage/aw;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    iput-object p1, p0, Ldefpackage/hc5;->q:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v6, p0, Ldefpackage/hc5;->o:Ldefpackage/xv;

    .line 71
    .line 72
    iput v2, p0, Ldefpackage/hc5;->p:I

    .line 73
    .line 74
    invoke-virtual {v6, p0}, Ldefpackage/xv;->b(Ldefpackage/wd0;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v5, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object v9, v6

    .line 82
    move-object v6, p1

    .line 83
    move-object p1, v0

    .line 84
    move-object v0, v9

    .line 85
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    invoke-virtual {v0}, Ldefpackage/xv;->c()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Ldefpackage/hc5;->v:Landroid/content/Context;

    .line 97
    .line 98
    sget-object v7, Ldefpackage/ic5;->a:Ldefpackage/w03;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const-string v7, "animator_duration_scale"

    .line 105
    .line 106
    const/high16 v8, 0x3f800000    # 1.0f

    .line 107
    .line 108
    invoke-static {p1, v7, v8}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    new-instance v7, Ljava/lang/Float;

    .line 113
    .line 114
    invoke-direct {v7, p1}, Ljava/lang/Float;-><init>(F)V

    .line 115
    .line 116
    .line 117
    iput-object v6, p0, Ldefpackage/hc5;->q:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v0, p0, Ldefpackage/hc5;->o:Ldefpackage/xv;

    .line 120
    .line 121
    iput v1, p0, Ldefpackage/hc5;->p:I

    .line 122
    .line 123
    invoke-interface {v6, v7, p0}, Ldefpackage/q81;->b(Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    if-ne p1, v5, :cond_0

    .line 128
    .line 129
    :goto_2
    return-object v5

    .line 130
    :cond_5
    invoke-virtual {v4, v3}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 131
    .line 132
    .line 133
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 134
    .line 135
    return-object p0

    .line 136
    :goto_3
    invoke-virtual {v4, v3}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 137
    .line 138
    .line 139
    throw p0
.end method
