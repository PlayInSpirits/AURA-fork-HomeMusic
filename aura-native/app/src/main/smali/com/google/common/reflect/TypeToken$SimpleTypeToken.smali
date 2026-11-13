.class final Lcom/google/common/reflect/TypeToken$SimpleTypeToken;
.super Lcom/google/common/reflect/TypeToken;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/reflect/TypeToken;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SimpleTypeToken"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/reflect/TypeToken<",
        "TT;>;"
    }
.end annotation

.method public constructor <init>(Ljava/lang/reflect/Type;Ldefpackage/tz4;)V
    .registers 3

    invoke-direct/range {p0 .. p2}, Lcom/google/common/reflect/TypeToken;-><init>(Ljava/lang/reflect/Type;Ldefpackage/tz4;)V

    return-void
.end method
