.class public abstract Ldefpackage/bq1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ej4;


# instance fields
.field public final n:Ldefpackage/cc1;

.field public o:Z

.field public final synthetic p:Ldefpackage/hq1;


# direct methods
.method public constructor <init>(Ldefpackage/hq1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/bq1;->p:Ldefpackage/hq1;

    .line 5
    .line 6
    new-instance v0, Ldefpackage/cc1;

    .line 7
    .line 8
    iget-object p1, p1, Ldefpackage/hq1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ldefpackage/fw;

    .line 11
    .line 12
    invoke-interface {p1}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {v0, p1}, Ldefpackage/cc1;-><init>(Ldefpackage/fu4;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ldefpackage/bq1;->n:Ldefpackage/cc1;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/bq1;->p:Ldefpackage/hq1;

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/hq1;->a:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v3, 0x5

    .line 10
    if-ne v1, v3, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/bq1;->n:Ldefpackage/cc1;

    .line 13
    .line 14
    iget-object v1, p0, Ldefpackage/cc1;->e:Ldefpackage/fu4;

    .line 15
    .line 16
    sget-object v3, Ldefpackage/fu4;->d:Ldefpackage/eu4;

    .line 17
    .line 18
    iput-object v3, p0, Ldefpackage/cc1;->e:Ldefpackage/fu4;

    .line 19
    .line 20
    invoke-virtual {v1}, Ldefpackage/fu4;->a()Ldefpackage/fu4;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ldefpackage/fu4;->b()Ldefpackage/fu4;

    .line 24
    .line 25
    .line 26
    iput v2, v0, Ldefpackage/hq1;->a:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    const-string p0, "state: "

    .line 30
    .line 31
    iget v0, v0, Ldefpackage/hq1;->a:I

    .line 32
    .line 33
    invoke-static {v0, p0}, Ldefpackage/zr2;->c(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public read(Ldefpackage/tv;J)J
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/bq1;->p:Ldefpackage/hq1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v1, v0, Ldefpackage/hq1;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ldefpackage/fw;

    .line 9
    .line 10
    invoke-interface {v1, p1, p2, p3}, Ldefpackage/ej4;->read(Ldefpackage/tv;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-wide p0

    .line 15
    :catch_0
    move-exception p1

    .line 16
    iget-object p2, v0, Ldefpackage/hq1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Ldefpackage/q21;

    .line 19
    .line 20
    invoke-interface {p2}, Ldefpackage/q21;->a()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ldefpackage/bq1;->b()V

    .line 24
    .line 25
    .line 26
    throw p1
.end method

.method public final timeout()Ldefpackage/fu4;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/bq1;->n:Ldefpackage/cc1;

    .line 2
    .line 3
    return-object p0
.end method
