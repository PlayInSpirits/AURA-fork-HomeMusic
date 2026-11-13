.class public final synthetic Ldefpackage/jl3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(IJLjava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/jl3;->n:I

    .line 2
    .line 3
    iput-wide p2, p0, Ldefpackage/jl3;->o:J

    .line 4
    .line 5
    iput-object p4, p0, Ldefpackage/jl3;->p:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/jl3;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, Ldefpackage/jl3;->p:Ljava/lang/String;

    .line 7
    .line 8
    iget-wide v5, p0, Ldefpackage/jl3;->o:J

    .line 9
    .line 10
    check-cast p1, Ldefpackage/x34;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    const-string p0, "UPDATE queue SET last_play=? WHERE id=?"

    .line 16
    .line 17
    invoke-interface {p1, p0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :try_start_0
    invoke-interface {p0, v3, v5, v6}, Ldefpackage/z34;->c(IJ)V

    .line 22
    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    invoke-interface {p0, v2}, Ldefpackage/z34;->e(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-interface {p0, v2, v4}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-interface {p0}, Ldefpackage/z34;->O()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :pswitch_0
    const-string p0, "UPDATE playlist SET lastPlayed = ? WHERE id = ?"

    .line 47
    .line 48
    invoke-interface {p1, p0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    :try_start_1
    invoke-interface {p0, v3, v5, v6}, Ldefpackage/z34;->c(IJ)V

    .line 53
    .line 54
    .line 55
    if-nez v4, :cond_1

    .line 56
    .line 57
    invoke-interface {p0, v2}, Ldefpackage/z34;->e(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :catchall_1
    move-exception p1

    .line 62
    goto :goto_3

    .line 63
    :cond_1
    invoke-interface {p0, v2, v4}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :goto_2
    invoke-interface {p0}, Ldefpackage/z34;->O()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    .line 68
    .line 69
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :goto_3
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 74
    .line 75
    .line 76
    throw p1

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
