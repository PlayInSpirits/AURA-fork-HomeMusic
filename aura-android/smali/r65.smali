.class public final Lr65;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final d:Ljo3;


# instance fields
.field public a:I

.field public b:Ln50;

.field public c:Ln50;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljo3;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljo3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr65;->d:Ljo3;

    .line 9
    .line 10
    return-void
.end method

.method public static a()Lr65;
    .locals 1

    .line 1
    sget-object v0, Lr65;->d:Ljo3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljo3;->b()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr65;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lr65;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method
