.class public final enum Ldefpackage/s05;
.super Ldefpackage/x05;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "JAVA6"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    new-instance p0, Ldefpackage/a;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, v0, p1}, Ldefpackage/a;-><init>(ILjava/lang/reflect/Type;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final d(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p0, p1, Ljava/lang/Class;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    move-object p0, p1

    .line 9
    check-cast p0, Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance p1, Ldefpackage/a;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-direct {p1, v0, p0}, Ldefpackage/a;-><init>(ILjava/lang/reflect/Type;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object p1
.end method
