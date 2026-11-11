.class public final Ltm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/net/Uri;

.field public c:Ljava/lang/String;

.field public d:Lum2;

.field public e:Lxm2;

.field public f:Ljava/util/List;

.field public g:Ljava/lang/String;

.field public h:Lyw1;

.field public i:Lsm2;

.field public j:J

.field public k:Ldo2;

.field public l:Lzm2;

.field public m:Lcn2;


# virtual methods
.method public final a()Lgn2;
    .locals 11

    .line 1
    iget-object v0, p0, Ltm2;->e:Lxm2;

    .line 2
    .line 3
    iget-object v1, v0, Lxm2;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/net/Uri;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v0, v0, Lxm2;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/UUID;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    :goto_1
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Ltm2;->b:Landroid/net/Uri;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    new-instance v1, Lbn2;

    .line 28
    .line 29
    iget-object v3, p0, Ltm2;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v4, p0, Ltm2;->e:Lxm2;

    .line 32
    .line 33
    iget-object v5, v4, Lxm2;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Ljava/util/UUID;

    .line 36
    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    new-instance v0, Lym2;

    .line 40
    .line 41
    invoke-direct {v0, v4}, Lym2;-><init>(Lxm2;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    move-object v4, v0

    .line 45
    iget-object v5, p0, Ltm2;->i:Lsm2;

    .line 46
    .line 47
    iget-object v6, p0, Ltm2;->f:Ljava/util/List;

    .line 48
    .line 49
    iget-object v7, p0, Ltm2;->g:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v8, p0, Ltm2;->h:Lyw1;

    .line 52
    .line 53
    iget-wide v9, p0, Ltm2;->j:J

    .line 54
    .line 55
    invoke-direct/range {v1 .. v10}, Lbn2;-><init>(Landroid/net/Uri;Ljava/lang/String;Lym2;Lsm2;Ljava/util/List;Ljava/lang/String;Lyw1;J)V

    .line 56
    .line 57
    .line 58
    move-object v5, v1

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move-object v5, v0

    .line 61
    :goto_2
    new-instance v2, Lgn2;

    .line 62
    .line 63
    iget-object v0, p0, Ltm2;->a:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    :goto_3
    move-object v3, v0

    .line 68
    goto :goto_4

    .line 69
    :cond_4
    const-string v0, ""

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :goto_4
    iget-object v0, p0, Ltm2;->d:Lum2;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v4, Lwm2;

    .line 78
    .line 79
    invoke-direct {v4, v0}, Lvm2;-><init>(Lum2;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Ltm2;->l:Lzm2;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v6, Lan2;

    .line 88
    .line 89
    invoke-direct {v6, v0}, Lan2;-><init>(Lzm2;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Ltm2;->k:Ldo2;

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    :goto_5
    move-object v7, v0

    .line 97
    goto :goto_6

    .line 98
    :cond_5
    sget-object v0, Ldo2;->K:Ldo2;

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :goto_6
    iget-object v8, p0, Ltm2;->m:Lcn2;

    .line 102
    .line 103
    invoke-direct/range {v2 .. v8}, Lgn2;-><init>(Ljava/lang/String;Lwm2;Lbn2;Lan2;Ldo2;Lcn2;)V

    .line 104
    .line 105
    .line 106
    return-object v2
.end method
