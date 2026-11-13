.class public final Ldefpackage/nq1;
.super Ldefpackage/q42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# instance fields
.field public final synthetic n:Ldefpackage/rq1;

.field public final synthetic o:I

.field public final synthetic p:Ldefpackage/tv;

.field public final synthetic q:I


# direct methods
.method public constructor <init>(Ldefpackage/rq1;ILdefpackage/tv;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/nq1;->n:Ldefpackage/rq1;

    .line 2
    .line 3
    iput p2, p0, Ldefpackage/nq1;->o:I

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/nq1;->p:Ldefpackage/tv;

    .line 6
    .line 7
    iput p4, p0, Ldefpackage/nq1;->q:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Ldefpackage/q42;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/nq1;->n:Ldefpackage/rq1;

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/nq1;->o:I

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/nq1;->p:Ldefpackage/tv;

    .line 6
    .line 7
    iget p0, p0, Ldefpackage/nq1;->q:I

    .line 8
    .line 9
    :try_start_0
    iget-object v3, v0, Ldefpackage/rq1;->x:Ldefpackage/rv2;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    int-to-long v3, p0

    .line 15
    invoke-virtual {v2, v3, v4}, Ldefpackage/tv;->skip(J)V

    .line 16
    .line 17
    .line 18
    iget-object p0, v0, Ldefpackage/rq1;->J:Ldefpackage/zq1;

    .line 19
    .line 20
    sget-object v2, Ldefpackage/b21;->u:Ldefpackage/b21;

    .line 21
    .line 22
    invoke-virtual {p0, v1, v2}, Ldefpackage/zq1;->u(ILdefpackage/b21;)V

    .line 23
    .line 24
    .line 25
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    :try_start_1
    iget-object p0, v0, Ldefpackage/rq1;->L:Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {p0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    :try_start_2
    monitor-exit v0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    monitor-exit v0

    .line 39
    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 40
    :catch_0
    :goto_0
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 41
    .line 42
    return-object p0
.end method
