.class public final Lym0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lde;


# static fields
.field public static final n:Lym0;

.field public static final o:Ld81;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lym0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lym0;->n:Lym0;

    .line 7
    .line 8
    new-instance v0, Ld81;

    .line 9
    .line 10
    const v1, 0x44bb8000    # 1500.0f

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ld81;-><init>(F)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lym0;->o:Ld81;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final get(I)Lc81;
    .locals 0

    .line 1
    sget-object p0, Lym0;->o:Ld81;

    .line 2
    .line 3
    return-object p0
.end method
