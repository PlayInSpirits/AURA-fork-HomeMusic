.class public final synthetic Lgs2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lla0;

.field public final synthetic o:Lgr2;

.field public final synthetic p:Z

.field public final synthetic q:Z

.field public final synthetic r:Lfr2;


# direct methods
.method public synthetic constructor <init>(Lla0;Lgr2;ZZLfr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgs2;->n:Lla0;

    .line 5
    .line 6
    iput-object p2, p0, Lgs2;->o:Lgr2;

    .line 7
    .line 8
    iput-boolean p3, p0, Lgs2;->p:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lgs2;->q:Z

    .line 11
    .line 12
    iput-object p5, p0, Lgs2;->r:Lfr2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lgs2;->n:Lla0;

    .line 2
    .line 3
    iget-object v0, v0, Lla0;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lls2;

    .line 6
    .line 7
    iget-object v0, v0, Lls2;->g:Ltn2;

    .line 8
    .line 9
    iget-object v1, v0, Ltn2;->s:Lal3;

    .line 10
    .line 11
    iget-object v2, p0, Lgs2;->o:Lgr2;

    .line 12
    .line 13
    invoke-static {v1, v2}, Lju2;->f(Lqi3;Lgr2;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lal3;->g()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget-boolean v3, p0, Lgs2;->p:Z

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    const/4 v5, 0x1

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    if-ne v2, v5, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1, v4}, Lal3;->S0(I)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Lal3;->b()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v3, 0x4

    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Lal3;->S0(I)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1}, Lal3;->C()V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    iget-boolean v2, p0, Lgs2;->q:Z

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1, v5}, Lal3;->S0(I)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    invoke-virtual {v1}, Lal3;->m0()V

    .line 61
    .line 62
    .line 63
    :cond_2
    new-instance v1, Landroid/util/SparseBooleanArray;

    .line 64
    .line 65
    invoke-direct {v1}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 66
    .line 67
    .line 68
    const/16 v3, 0x1f

    .line 69
    .line 70
    filled-new-array {v3, v4}, [I

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    array-length v4, v3

    .line 75
    const/4 v6, 0x0

    .line 76
    move v7, v6

    .line 77
    :goto_1
    if-ge v7, v4, :cond_3

    .line 78
    .line 79
    aget v8, v3, v7

    .line 80
    .line 81
    const/4 v9, 0x0

    .line 82
    xor-int/2addr v9, v5

    .line 83
    invoke-static {v9}, Lrr2;->w(Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v8, v5}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v7, v7, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    if-eqz v2, :cond_4

    .line 93
    .line 94
    const/4 v2, 0x0

    .line 95
    xor-int/2addr v2, v5

    .line 96
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v5, v5}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 100
    .line 101
    .line 102
    :cond_4
    new-instance v2, Lmi3;

    .line 103
    .line 104
    xor-int/lit8 v3, v6, 0x1

    .line 105
    .line 106
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 107
    .line 108
    .line 109
    new-instance v3, Lw71;

    .line 110
    .line 111
    invoke-direct {v3, v1}, Lw71;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 112
    .line 113
    .line 114
    invoke-direct {v2, v3}, Lmi3;-><init>(Lw71;)V

    .line 115
    .line 116
    .line 117
    iget-object p0, p0, Lgs2;->r:Lfr2;

    .line 118
    .line 119
    invoke-virtual {v0, p0, v2}, Ltn2;->v(Lfr2;Lmi3;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method
