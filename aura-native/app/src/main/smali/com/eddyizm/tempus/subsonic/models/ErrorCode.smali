.class public final Lcom/eddyizm/tempus/subsonic/models/ErrorCode;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x0

.field public static final Companion:Ldefpackage/a21;

.field private static DATA_NOT_FOUND:I = 0x46

.field private static GENERIC_ERROR:I = 0x0

.field private static INCOMPATIBLE_VERSION_CLIENT:I = 0x14

.field private static INCOMPATIBLE_VERSION_SERVER:I = 0x1e

.field private static REQUIRED_PARAMETER_MISSING:I = 0xa

.field private static TOKEN_AUTHENTICATION_NOT_SUPPORTED:I = 0x29

.field private static TRIAL_PERIOD_OVER:I = 0x3c

.field private static USER_NOT_AUTHORIZED:I = 0x32

.field private static WRONG_USERNAME_OR_PASSWORD:I = 0x28


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/a21;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->Companion:Ldefpackage/a21;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getDATA_NOT_FOUND$cp()I
    .locals 1

    .line 1
    sget v0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->DATA_NOT_FOUND:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getGENERIC_ERROR$cp()I
    .locals 1

    .line 1
    sget v0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->GENERIC_ERROR:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getINCOMPATIBLE_VERSION_CLIENT$cp()I
    .locals 1

    .line 1
    sget v0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->INCOMPATIBLE_VERSION_CLIENT:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getINCOMPATIBLE_VERSION_SERVER$cp()I
    .locals 1

    .line 1
    sget v0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->INCOMPATIBLE_VERSION_SERVER:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getREQUIRED_PARAMETER_MISSING$cp()I
    .locals 1

    .line 1
    sget v0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->REQUIRED_PARAMETER_MISSING:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getTOKEN_AUTHENTICATION_NOT_SUPPORTED$cp()I
    .locals 1

    .line 1
    sget v0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->TOKEN_AUTHENTICATION_NOT_SUPPORTED:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getTRIAL_PERIOD_OVER$cp()I
    .locals 1

    .line 1
    sget v0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->TRIAL_PERIOD_OVER:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getUSER_NOT_AUTHORIZED$cp()I
    .locals 1

    .line 1
    sget v0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->USER_NOT_AUTHORIZED:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$getWRONG_USERNAME_OR_PASSWORD$cp()I
    .locals 1

    .line 1
    sget v0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->WRONG_USERNAME_OR_PASSWORD:I

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic access$setDATA_NOT_FOUND$cp(I)V
    .locals 0

    .line 1
    sput p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->DATA_NOT_FOUND:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setGENERIC_ERROR$cp(I)V
    .locals 0

    .line 1
    sput p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->GENERIC_ERROR:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setINCOMPATIBLE_VERSION_CLIENT$cp(I)V
    .locals 0

    .line 1
    sput p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->INCOMPATIBLE_VERSION_CLIENT:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setINCOMPATIBLE_VERSION_SERVER$cp(I)V
    .locals 0

    .line 1
    sput p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->INCOMPATIBLE_VERSION_SERVER:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setREQUIRED_PARAMETER_MISSING$cp(I)V
    .locals 0

    .line 1
    sput p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->REQUIRED_PARAMETER_MISSING:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setTOKEN_AUTHENTICATION_NOT_SUPPORTED$cp(I)V
    .locals 0

    .line 1
    sput p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->TOKEN_AUTHENTICATION_NOT_SUPPORTED:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setTRIAL_PERIOD_OVER$cp(I)V
    .locals 0

    .line 1
    sput p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->TRIAL_PERIOD_OVER:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setUSER_NOT_AUTHORIZED$cp(I)V
    .locals 0

    .line 1
    sput p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->USER_NOT_AUTHORIZED:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setWRONG_USERNAME_OR_PASSWORD$cp(I)V
    .locals 0

    .line 1
    sput p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->WRONG_USERNAME_OR_PASSWORD:I

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final getValue()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/ErrorCode;->value:I

    .line 2
    .line 3
    return p0
.end method
