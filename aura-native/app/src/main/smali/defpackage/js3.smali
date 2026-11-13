.class public final synthetic Ldefpackage/js3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:J

.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(JJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ldefpackage/js3;->n:J

    .line 5
    .line 6
    iput-wide p3, p0, Ldefpackage/js3;->o:J

    .line 7
    .line 8
    iput-object p5, p0, Ldefpackage/js3;->p:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-wide v0, p0, Ldefpackage/js3;->n:J

    .line 2
    .line 3
    iget-wide v2, p0, Ldefpackage/js3;->o:J

    .line 4
    .line 5
    check-cast p1, Ldefpackage/x34;

    .line 6
    .line 7
    const-string v4, "UPDATE queue SET last_play=?, playing_changed=? WHERE id=?"

    .line 8
    .line 9
    invoke-interface {p1, v4}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v4, 0x1

    .line 14
    :try_start_0
    invoke-interface {p1, v4, v0, v1}, Ldefpackage/z34;->c(IJ)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-interface {p1, v0, v2, v3}, Ldefpackage/z34;->c(IJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/js3;->p:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    :try_start_1
    invoke-interface {p1, v0}, Ldefpackage/z34;->e(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-interface {p1, v0, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-interface {p1}, Ldefpackage/z34;->O()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0

    .line 43
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 44
    .line 45
    .line 46
    throw p0
.end method
