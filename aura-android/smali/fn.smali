.class public abstract Lfn;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lrf2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lpa;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lu02;

    .line 8
    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    invoke-direct {v1, v2}, Lu02;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lrf2;

    .line 15
    .line 16
    const-string v3, "Auth.GOOGLE_SIGN_IN_API"

    .line 17
    .line 18
    invoke-direct {v2, v3, v1, v0}, Lrf2;-><init>(Ljava/lang/String;Lvr1;Lpa;)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Lfn;->a:Lrf2;

    .line 22
    .line 23
    return-void
.end method
