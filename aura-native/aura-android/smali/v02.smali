.class public abstract Lv02;
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
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v2}, Lu02;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lrf2;

    .line 14
    .line 15
    const-string v3, "IdentityCredentials.API"

    .line 16
    .line 17
    invoke-direct {v2, v3, v1, v0}, Lrf2;-><init>(Ljava/lang/String;Lvr1;Lpa;)V

    .line 18
    .line 19
    .line 20
    sput-object v2, Lv02;->a:Lrf2;

    .line 21
    .line 22
    return-void
.end method
