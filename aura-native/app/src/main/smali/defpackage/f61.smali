.class public final Ldefpackage/f61;
.super Ldefpackage/zb1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final o:Ldefpackage/if1;

.field public p:Z


# direct methods
.method public constructor <init>(Ldefpackage/of4;Ldefpackage/if1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Ldefpackage/zb1;-><init>(Ldefpackage/of4;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ldefpackage/f61;->o:Ldefpackage/if1;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final L(Ldefpackage/tv;J)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/f61;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1, p2, p3}, Ldefpackage/tv;->skip(J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    iget-object v0, p0, Ldefpackage/zb1;->n:Ldefpackage/of4;

    .line 10
    .line 11
    invoke-interface {v0, p1, p2, p3}, Ldefpackage/of4;->L(Ldefpackage/tv;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p1

    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p0, Ldefpackage/f61;->p:Z

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/f61;->o:Ldefpackage/if1;

    .line 20
    .line 21
    invoke-interface {p0, p1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final close()V
    .locals 2

    .line 1
    :try_start_0
    invoke-super {p0}, Ldefpackage/zb1;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception v0

    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, p0, Ldefpackage/f61;->p:Z

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/f61;->o:Ldefpackage/if1;

    .line 10
    .line 11
    invoke-interface {p0, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final flush()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/f61;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-super {p0}, Ldefpackage/zb1;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :catch_0
    move-exception v0

    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Ldefpackage/f61;->p:Z

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/f61;->o:Ldefpackage/if1;

    .line 15
    .line 16
    invoke-interface {p0, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method
