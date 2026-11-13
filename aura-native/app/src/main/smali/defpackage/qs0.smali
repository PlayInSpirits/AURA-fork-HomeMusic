.class public final synthetic Ldefpackage/qs0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Ldefpackage/qs0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/qs0;->o:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/qs0;->p:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p3, p0, Ldefpackage/qs0;->q:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/qs0;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/qs0;->q:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/qs0;->p:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/qs0;->o:Ljava/lang/String;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v0, "/api/dislikes"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, Ldefpackage/fr1;

    .line 24
    .line 25
    invoke-direct {v0}, Ldefpackage/fr1;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v0, v3, p1}, Ldefpackage/fr1;->e(Ldefpackage/gr1;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ldefpackage/gr1;->g()Ldefpackage/fr1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1, p0, v2}, Ldefpackage/fr1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string p0, "client"

    .line 44
    .line 45
    invoke-virtual {p1, p0, v1}, Ldefpackage/fr1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ldefpackage/fr1;->b()Ldefpackage/gr1;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance p1, Ldefpackage/nz3;

    .line 53
    .line 54
    invoke-direct {p1}, Ldefpackage/nz3;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p0, p1, Ldefpackage/nz3;->a:Ldefpackage/gr1;

    .line 58
    .line 59
    sget-object p0, Ldefpackage/xe5;->d:Ldefpackage/we5;

    .line 60
    .line 61
    const-string v0, "DELETE"

    .line 62
    .line 63
    invoke-virtual {p1, v0, p0}, Ldefpackage/nz3;->b(Ljava/lang/String;Ldefpackage/tz3;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, Ldefpackage/oz3;

    .line 67
    .line 68
    invoke-direct {p0, p1}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_0
    check-cast p1, Ldefpackage/x34;

    .line 73
    .line 74
    const-string v0, "UPDATE download SET album_artist = ? WHERE album_id = ? AND album = ? AND NULLIF(album_artist, \'\') IS NULL"

    .line 75
    .line 76
    invoke-interface {p1, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/4 v3, 0x1

    .line 81
    :try_start_0
    invoke-interface {v0, v3, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 p0, 0x2

    .line 85
    if-nez v2, :cond_0

    .line 86
    .line 87
    invoke-interface {v0, p0}, Ldefpackage/z34;->e(I)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    goto :goto_1

    .line 93
    :cond_0
    invoke-interface {v0, p0, v2}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    const/4 p0, 0x3

    .line 97
    invoke-interface {v0, p0, v1}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0}, Ldefpackage/z34;->O()Z

    .line 101
    .line 102
    .line 103
    invoke-static {p1}, Ldefpackage/ji2;->x(Ldefpackage/x34;)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :goto_1
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 116
    .line 117
    .line 118
    throw p0

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
