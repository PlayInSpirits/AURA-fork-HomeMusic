.class public abstract enum Ldefpackage/zz4;
.super Ljava/lang/Enum;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ro3;


# static fields
.field public static final enum n:Ldefpackage/xz4;

.field public static final synthetic o:[Ldefpackage/zz4;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/xz4;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/xz4;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/zz4;->n:Ldefpackage/xz4;

    .line 7
    .line 8
    new-instance v1, Ldefpackage/yz4;

    .line 9
    .line 10
    invoke-direct {v1}, Ldefpackage/yz4;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    new-array v2, v2, [Ldefpackage/zz4;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object v0, v2, v3

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    aput-object v1, v2, v0

    .line 21
    .line 22
    sput-object v2, Ldefpackage/zz4;->o:[Ldefpackage/zz4;

    .line 23
    .line 24
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldefpackage/zz4;
    .locals 1

    .line 1
    const-class v0, Ldefpackage/zz4;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/zz4;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ldefpackage/zz4;
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/zz4;->o:[Ldefpackage/zz4;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ldefpackage/zz4;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldefpackage/zz4;

    .line 8
    .line 9
    return-object v0
.end method
