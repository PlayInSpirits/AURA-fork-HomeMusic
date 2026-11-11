.class public Lu23;
.super Lt43;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt43;"
    }
.end annotation

.annotation runtime Ls43;
    value = "navigation"
.end annotation


# instance fields
.field public final c:Lu43;


# direct methods
.method public constructor <init>(Lu43;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu23;->c:Lu43;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Lr23;
    .locals 1

    .line 1
    new-instance v0, Lt23;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lt23;-><init>(Lu23;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d(Ljava/util/List;Ly23;)V
    .locals 6

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_5

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La23;

    .line 16
    .line 17
    iget-object v1, v0, La23;->o:Lr23;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast v1, Lt23;

    .line 23
    .line 24
    invoke-virtual {v0}, La23;->c()Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v2, v1, Lt23;->y:I

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    new-instance p0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string p1, "no start destination defined via app:startDestination for "

    .line 35
    .line 36
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget p1, v1, Lr23;->u:I

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    iget-object p2, v1, Lr23;->p:Ljava/lang/String;

    .line 44
    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const-string p2, "the root navigation"

    .line 53
    .line 54
    :cond_1
    :goto_1
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    iget-object v3, v1, Lt23;->x:Lmj4;

    .line 72
    .line 73
    invoke-virtual {v3, v2}, Lmj4;->b(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Lr23;

    .line 78
    .line 79
    if-nez v2, :cond_4

    .line 80
    .line 81
    iget-object p0, v1, Lt23;->z:Ljava/lang/String;

    .line 82
    .line 83
    if-nez p0, :cond_3

    .line 84
    .line 85
    iget p0, v1, Lt23;->y:I

    .line 86
    .line 87
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iput-object p0, v1, Lt23;->z:Ljava/lang/String;

    .line 92
    .line 93
    :cond_3
    iget-object p0, v1, Lt23;->z:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const-string p1, "navigation destination "

    .line 99
    .line 100
    const-string p2, " is not a direct child of this NavGraph"

    .line 101
    .line 102
    invoke-static {p1, p0, p2}, Lxa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_4
    iget-object v1, p0, Lu23;->c:Lu43;

    .line 111
    .line 112
    iget-object v3, v2, Lr23;->n:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v1, v3}, Lu43;->b(Ljava/lang/String;)Lt43;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-virtual {v2, v0}, Lr23;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v3, v3, Ld23;->h:Lv23;

    .line 127
    .line 128
    iget-object v4, v3, Lv23;->a:Landroid/content/Context;

    .line 129
    .line 130
    invoke-virtual {v3}, Lv23;->j()Lr92;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    iget-object v3, v3, Lv23;->o:Lj23;

    .line 135
    .line 136
    invoke-static {v4, v2, v0, v5, v3}, Ltv1;->v(Landroid/content/Context;Lr23;Landroid/os/Bundle;Lr92;Lj23;)La23;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v1, v0, p2}, Lt43;->d(Ljava/util/List;Ly23;)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_5
    return-void
.end method
