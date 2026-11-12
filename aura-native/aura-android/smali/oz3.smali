.class public final Loz3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lgr1;

.field public final b:Ljava/lang/String;

.field public final c:Ltl1;

.field public final d:Ltz3;

.field public final e:Ljava/util/Map;

.field public f:Lix;


# direct methods
.method public constructor <init>(Lnz3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lnz3;->a:Lgr1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-object v0, p0, Loz3;->a:Lgr1;

    .line 9
    .line 10
    iget-object v0, p1, Lnz3;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Loz3;->b:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, p1, Lnz3;->c:Lsl1;

    .line 15
    .line 16
    invoke-virtual {v0}, Lsl1;->c()Ltl1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Loz3;->c:Ltl1;

    .line 21
    .line 22
    iget-object v0, p1, Lnz3;->d:Ltz3;

    .line 23
    .line 24
    iput-object v0, p0, Loz3;->d:Ltz3;

    .line 25
    .line 26
    iget-object p1, p1, Lnz3;->e:Ljava/util/Map;

    .line 27
    .line 28
    invoke-static {p1}, Llg2;->a0(Ljava/util/Map;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Loz3;->e:Ljava/util/Map;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const-string p0, "url == null"

    .line 36
    .line 37
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    throw p0
.end method


# virtual methods
.method public final a()Lnz3;
    .locals 4

    .line 1
    new-instance v0, Lnz3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lv01;->n:Lv01;

    .line 7
    .line 8
    iput-object v1, v0, Lnz3;->e:Ljava/util/Map;

    .line 9
    .line 10
    iget-object v2, p0, Loz3;->a:Lgr1;

    .line 11
    .line 12
    iput-object v2, v0, Lnz3;->a:Lgr1;

    .line 13
    .line 14
    iget-object v2, p0, Loz3;->b:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v2, v0, Lnz3;->b:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Loz3;->d:Ltz3;

    .line 19
    .line 20
    iput-object v2, v0, Lnz3;->d:Ltz3;

    .line 21
    .line 22
    iget-object v2, p0, Loz3;->e:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iput-object v1, v0, Lnz3;->e:Ljava/util/Map;

    .line 37
    .line 38
    iget-object p0, p0, Loz3;->c:Ltl1;

    .line 39
    .line 40
    invoke-virtual {p0}, Ltl1;->d()Lsl1;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p0, v0, Lnz3;->c:Lsl1;

    .line 45
    .line 46
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Request{method="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Loz3;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", url="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Loz3;->a:Lgr1;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Loz3;->c:Ltl1;

    .line 24
    .line 25
    invoke-virtual {v1}, Ltl1;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_4

    .line 30
    .line 31
    const-string v2, ", headers=["

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ltl1;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v2, 0x0

    .line 41
    :goto_0
    move-object v3, v1

    .line 42
    check-cast v3, Lx0;

    .line 43
    .line 44
    invoke-virtual {v3}, Lx0;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    invoke-virtual {v3}, Lx0;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    add-int/lit8 v4, v2, 0x1

    .line 55
    .line 56
    if-ltz v2, :cond_2

    .line 57
    .line 58
    check-cast v3, Lkd3;

    .line 59
    .line 60
    iget-object v5, v3, Lkd3;->n:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v5, Ljava/lang/String;

    .line 63
    .line 64
    iget-object v3, v3, Lkd3;->o:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Ljava/lang/String;

    .line 67
    .line 68
    if-lez v2, :cond_0

    .line 69
    .line 70
    const-string v2, ", "

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const/16 v2, 0x3a

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Lxe5;->l(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    const-string v3, "\u2588\u2588"

    .line 90
    .line 91
    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    move v2, v4

    .line 95
    goto :goto_0

    .line 96
    :cond_2
    invoke-static {}, Lgb;->c0()V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    throw p0

    .line 101
    :cond_3
    const/16 v1, 0x5d

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    :cond_4
    iget-object p0, p0, Loz3;->e:Ljava/util/Map;

    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_5

    .line 113
    .line 114
    const-string v1, ", tags="

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    :cond_5
    const/16 p0, 0x7d

    .line 123
    .line 124
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0
.end method
