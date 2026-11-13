.class public final Ldefpackage/a05;
.super Ldefpackage/yb1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public transient u:Ldefpackage/jx1;

.field public final synthetic v:Lcom/google/common/reflect/TypeToken;


# direct methods
.method public constructor <init>(Lcom/google/common/reflect/TypeToken;)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ldefpackage/uo;-><init>(I)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldefpackage/a05;->v:Lcom/google/common/reflect/TypeToken;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final W()Ldefpackage/jx1;
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/a05;->u:Ldefpackage/jx1;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    sget-object v0, Ldefpackage/rv2;->G:Ldefpackage/rv2;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/a05;->v:Lcom/google/common/reflect/TypeToken;

    .line 8
    .line 9
    invoke-static {v1}, Ldefpackage/yw1;->o(Ljava/lang/Object;)Ldefpackage/gy3;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v1, v3}, Ldefpackage/yw1;->m(I)Ldefpackage/vw1;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    invoke-virtual {v1}, Ldefpackage/v0;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ldefpackage/v0;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v0, v4, v2}, Ldefpackage/rv2;->g(Ljava/lang/Object;Ljava/util/HashMap;)I

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Ldefpackage/wz4;

    .line 38
    .line 39
    invoke-direct {v0, v2}, Ldefpackage/wz4;-><init>(Ljava/util/HashMap;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/util/Collection;

    .line 47
    .line 48
    invoke-static {v0, v1}, Ldefpackage/yw1;->q(Ljava/util/Comparator;Ljava/util/Collection;)Ldefpackage/gy3;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Ldefpackage/l91;

    .line 53
    .line 54
    invoke-direct {v1, v0, v0}, Ldefpackage/l91;-><init>(Ljava/lang/Iterable;Ljava/lang/Iterable;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v1, Ldefpackage/m91;->n:Ldefpackage/bb3;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ldefpackage/bb3;->b(Ldefpackage/m91;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ljava/lang/Iterable;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v1, Ldefpackage/g22;

    .line 69
    .line 70
    sget-object v2, Ldefpackage/zz4;->n:Ldefpackage/xz4;

    .line 71
    .line 72
    invoke-direct {v1, v0, v2, v3}, Ldefpackage/g22;-><init>(Ljava/lang/Iterable;Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    sget v0, Ldefpackage/jx1;->p:I

    .line 76
    .line 77
    instance-of v0, v1, Ljava/util/Collection;

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    check-cast v1, Ljava/util/Collection;

    .line 82
    .line 83
    invoke-static {v1}, Ldefpackage/jx1;->k(Ljava/util/Collection;)Ldefpackage/jx1;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_2

    .line 88
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_2

    .line 97
    .line 98
    sget-object v0, Ldefpackage/ny3;->w:Ldefpackage/ny3;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_3

    .line 110
    .line 111
    new-instance v0, Ldefpackage/nf4;

    .line 112
    .line 113
    invoke-direct {v0, v1}, Ldefpackage/nf4;-><init>(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    new-instance v2, Ldefpackage/ix1;

    .line 118
    .line 119
    const/4 v3, 0x4

    .line 120
    invoke-direct {v2, v3}, Ldefpackage/pw1;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v1}, Ldefpackage/ix1;->f(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_4

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v2, v1}, Ldefpackage/ix1;->f(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    invoke-virtual {v2}, Ldefpackage/ix1;->g()Ldefpackage/jx1;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :goto_2
    iput-object v0, p0, Ldefpackage/a05;->u:Ldefpackage/jx1;

    .line 145
    .line 146
    :cond_5
    return-object v0
.end method
