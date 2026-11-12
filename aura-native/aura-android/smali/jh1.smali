.class public final Ljh1;
.super Lcx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrx4;


# static fields
.field public static final C:Ly41;


# instance fields
.field public final B:Lih1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly41;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ly41;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ljh1;->C:Ly41;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lih1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcx2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljh1;->B:Lih1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Ljh1;->C:Ly41;

    .line 2
    .line 3
    return-object p0
.end method
