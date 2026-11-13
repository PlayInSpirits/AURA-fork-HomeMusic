.class public final Ldefpackage/qq1;
.super Ldefpackage/q42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# instance fields
.field public final synthetic n:Ldefpackage/rq1;

.field public final synthetic o:I

.field public final synthetic p:J


# direct methods
.method public constructor <init>(Ldefpackage/rq1;IJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/qq1;->n:Ldefpackage/rq1;

    .line 2
    .line 3
    iput p2, p0, Ldefpackage/qq1;->o:I

    .line 4
    .line 5
    iput-wide p3, p0, Ldefpackage/qq1;->p:J

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Ldefpackage/q42;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/qq1;->n:Ldefpackage/rq1;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Ldefpackage/rq1;->J:Ldefpackage/zq1;

    .line 4
    .line 5
    iget v2, p0, Ldefpackage/qq1;->o:I

    .line 6
    .line 7
    iget-wide v3, p0, Ldefpackage/qq1;->p:J

    .line 8
    .line 9
    invoke-virtual {v1, v2, v3, v4}, Ldefpackage/zq1;->v(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    invoke-virtual {v0, p0}, Ldefpackage/rq1;->f(Ljava/io/IOException;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 18
    .line 19
    return-object p0
.end method
