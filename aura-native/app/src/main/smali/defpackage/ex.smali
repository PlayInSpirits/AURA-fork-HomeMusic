.class public final Ldefpackage/ex;
.super Ldefpackage/n14;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:Ldefpackage/fr0;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ldefpackage/xu3;


# direct methods
.method public constructor <init>(Ldefpackage/fr0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ex;->n:Ldefpackage/fr0;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/ex;->o:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/ex;->p:Ljava/lang/String;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    iget-object p1, p1, Ldefpackage/fr0;->p:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ldefpackage/ej4;

    .line 18
    .line 19
    new-instance p2, Ldefpackage/dx;

    .line 20
    .line 21
    invoke-direct {p2, p1, p0}, Ldefpackage/dx;-><init>(Ldefpackage/ej4;Ldefpackage/ex;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Ldefpackage/xu3;

    .line 25
    .line 26
    invoke-direct {p1, p2}, Ldefpackage/xu3;-><init>(Ldefpackage/ej4;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/ex;->q:Ldefpackage/xu3;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final contentLength()J
    .locals 3

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ex;->p:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object v2, Ldefpackage/xe5;->a:[B

    .line 8
    .line 9
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    :catch_0
    :cond_0
    return-wide v0
.end method

.method public final contentType()Ldefpackage/hu2;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Ldefpackage/ex;->o:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    :try_start_0
    invoke-static {p0}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :catch_0
    :cond_0
    return-object v0
.end method

.method public final source()Ldefpackage/fw;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ex;->q:Ldefpackage/xu3;

    .line 2
    .line 3
    return-object p0
.end method
