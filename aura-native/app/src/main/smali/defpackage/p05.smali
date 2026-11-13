.class public final enum Ldefpackage/p05;
.super Ldefpackage/r05;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "LOCAL_CLASS_HAS_NO_OWNER"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isLocalClass()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
